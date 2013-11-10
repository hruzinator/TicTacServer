package applet;

import game.Board;
import game.GameManager;
import game.Question;

import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;

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
	
	protected void showFullBoard(Board b){
		
	}
	
	protected void showQuestionPanel(Question q){
		
	}
	
	protected void refreshFullBoard(){}
}
