package applet;

import game.Board;
import game.GameManager;
import game.Question;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;

import javax.swing.JApplet;

public class MainApplet extends JApplet {

	public static void main(String[] args){
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GameManager theGame;
	private FullBoardPanel fb;
	//private QuestionPanel qp;
	private CardLayout card;

	public MainApplet() {
		theGame = new GameManager("change me later!", "or else you will fail", 0); //TODO change this
		fb = new FullBoardPanel(theGame, this);
		//qp = new QuestionPanel(theGame);
		
		card = new CardLayout();
		this.add(fb);
		//this.add(qp);
	}

	public void flip()
	{
		card.next(this);
	}
	protected void showFullBoard(Board b)
	{
		fb.showPanel();
	}

	/*protected void showQuestionPanel(Question q){
		qp.showPanel();
	}*/
	
	protected void onCLick(ActionEvent e)
	{
		
	}

	protected void refreshFullBoard(){}
}
