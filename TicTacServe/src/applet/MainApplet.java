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
		fb = new FullBoardPanel(theGame);
		qp = new QuestionPanel(theGame);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public void paint(Graphics g){
		showFullBoard(theGame.getGameState().getGameBoard());
	}

	protected void showFullBoard(Board b)
	{
		fb.show();
	}

	protected void showQuestionPanel(Question q){

	}

	protected void refreshFullBoard(){}
}
