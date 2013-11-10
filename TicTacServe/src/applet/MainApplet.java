package applet;

import game.Board;
import game.GameManager;
import game.Question;

import java.awt.Graphics;
import java.awt.GridLayout;
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
		//TODO get info from board class about the state of the board
		
		setLayout(new GridLayout(3, 3, 10, 10));

		for(int o = 0; o < 9; o++){
			JLayeredPane lp = new JLayeredPane();
			lp.setLayout(new GridLayout(3, 3, 2, 2));
			for(int i = 0; i < 9; i++){
				//TODO create a button with the proper label
				//TODO create some sort of listener
			}
			add(lp);
		}
	}
	
	protected void showQuestionPanel(Question q){
		
	}
	
	protected void refreshFullBoard(){}
}
