package applet;

import game.Board;
import game.GameManager;
import game.Question;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JApplet;

public class MainApplet extends JApplet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GameManager theGame;
	private FullBoardPanel fb;
	private QuestionPanel qp;

	public MainApplet() {
		theGame = new GameManager("change me later!", "or else you will fail", 0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public void paint(Graphics g){
		//TODO something with this
	}
	
	protected void showFullBoard(Board b)
	{
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
				}
	        fb.add(getLayout());
		fb.setVisible(true);
	}
	
	protected void showQuestionPanel(Question q){
		
	}
	
	protected void refreshFullBoard(){}
}
