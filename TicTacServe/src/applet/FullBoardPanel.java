package applet;

import javax.swing.JPanel;
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
	public FullBoardPanel() {
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
}
