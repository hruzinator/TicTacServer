package applet;

import game.GameManager;

import javax.swing.JPanel;

import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;

public class FullBoardPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * USE FOR TESTING ONLY!
	 */
	public static void main(String[] args){
	}

	/**
	 * Create the panel.
	 */
	public FullBoardPanel(GameManager gm) {
		
		setLayout(new GridLayout(3, 3, 10, 10));

		for(int o = 0; o < 9; o++){
			JLayeredPane lp = new JLayeredPane();
			lp.setLayout(new GridLayout(3, 3, 2, 2));
			for(int i = 0; i < 9; i++){
				//TODO create a button
				//TODO create some sort of listener
			}
			add(lp);
		}
	}
	
	public void show(){
		GridLayout bigGrid = new GridLayout(9, 9, 3, 3);
		setLayout(bigGrid);
		Color[] colors = new Color[3];
		colors[0] = new Color(153, 255, 255);
		colors[1] = new Color(204, 204, 0);
		colors[2] = new Color(255, 153, 153);
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				for(int k = 0; k<3; k++)
				{
					Button bu = new Button();
					bu.setBackground(colors[j]);
					this.add(bu);
				}
		colors[0] = new Color(0, 153, 0);
		colors[1] = new Color(255, 255, 255);
		colors[2] = new Color(0, 0, 255);
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				for(int k = 0; k<3; k++)
				{
					Button bu = new Button();
					bu.setBackground(colors[j]);
					this.add(bu);
				}
		colors[0] = new Color(255, 255, 153);
		colors[1] = new Color(127, 0, 255);
		colors[2] = new Color(153, 255, 153);
		for(int i = 0; i<3; i++)
			for(int j = 0; j<3; j++)
				for(int k = 0; k<3; k++)
				{
					Button bu = new Button();
					bu.setBackground(colors[j]);
					this.add(bu);
				}
	}
}
