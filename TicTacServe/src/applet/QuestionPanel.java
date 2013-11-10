package applet;

import java.awt.FlowLayout;

import game.GameManager;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class QuestionPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public QuestionPanel(GameManager gm) {
		showPanel();
	}

	public void showPanel()
	{
		setLayout(new FlowLayout());
		JLabel questionLabel = new JLabel("Your question is: ");
		this.add(questionLabel);
		JTextField question = new JTextField("What is the answer?");
		question.setEditable(false);
		this.add(question);
		JTextField answerField = new JTextField();
		answerField.setText("--Your answer here--");
		this.add(answerField);
		setVisible(true);
	}
}
