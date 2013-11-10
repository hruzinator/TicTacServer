package applet;

import game.GameManager;
import game.Player;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FullBoardPanel extends JPanel {

	GameManager gm;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainApplet mainApp;
	private Player player1 = new Player("player 1");
	private Player player2 = new Player("player 2");
	private Player current = player1;
	/*
	 * USE FOR TESTING ONLY!
	 */
	public static void main(String[] args){
	}

	/**
	 * Create the panel.
	 */
	public FullBoardPanel(GameManager gm, MainApplet main) {
		this.gm = gm;
		showPanel();
		mainApp = main;
	}

	public void showPanel(){
		GridLayout bigGrid = new GridLayout(9, 9, 3, 3);
		setLayout(bigGrid);
		ActionListener buttonListener = null;
		Color[] colors = new Color[3];
		colors[0] = new Color(153, 255, 255);
		colors[1] = new Color(204, 204, 0);
		colors[2] = new Color(255, 153, 153);
		//top set of rows
		for(int i = 0; i<3; i++) //row 0, 1, 2 (i)
			for(int j = 0; j<3; j++) //box 0, 1, 2 (j)
				for(int k = 0; k<3; k++) //button 0, 1, 2 (k)
				{
					final TriviaJButton bu = new TriviaJButton(k, i, j, 0);
					bu.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							//if(e.getSource() instanceof TriviaJButton)
								//mainApp.flip();
							if(gm.move(bu.getSubX(), bu.getSubY(), bu.getElemX(), bu.getElemY(), current))
							{
								if(current.equals(player1))
								{
									current = player2;
									bu.setText("x");
								}
								else
								{
									current = player1;
									bu.setText("o");
								}
							}
						}
					});
					bu.setVisible(true);
					bu.setBackground(colors[j]);
					this.add(bu);
				}
		colors[0] = new Color(0, 153, 0);
		colors[1] = new Color(255, 255, 255);
		colors[2] = new Color(0, 0, 255);
		//middle set of rows
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				for(int k = 0; k<3; k++)
				{
					TriviaJButton bu = new TriviaJButton(k, i, j, 1);
					bu.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							//if(e.getSource() instanceof TriviaJButton)
								//mainApp.flip();
						}
					});
					bu.addActionListener(buttonListener);
					bu.setVisible(true);
					bu.setBackground(colors[j]);
					this.add(bu);
				}
		colors[0] = new Color(255, 255, 153);
		colors[1] = new Color(127, 0, 255);
		colors[2] = new Color(153, 255, 153);
		//bottom rows
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				for(int k = 0; k<3; k++)
				{
					TriviaJButton bu = new TriviaJButton(k, i, j, 2);
					bu.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							//if(e.getSource() instanceof TriviaJButton)
								//mainApp.flip();
						}
					});
					bu.setVisible(true);
					bu.setBackground(colors[j]);
					this.add(bu);
				}
		setVisible(true);
	}
	
	public void onAction(ActionEvent e)
	{
		
	}
}
