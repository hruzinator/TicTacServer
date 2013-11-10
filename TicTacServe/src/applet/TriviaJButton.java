package applet;

import javax.swing.JButton;

public class TriviaJButton extends JButton
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int xElemCoord;
	private int yElemCoord;
	private int xSubCoord;
	private int ySubCoord;
	
	public TriviaJButton(int xel, int yel, int xsub, int ysub)
	{
		super();
		xElemCoord = xel;
		yElemCoord = yel;
		xSubCoord = xsub;
		ySubCoord = ysub;
	}
	
	public int getElemX()
	{
		return xElemCoord;
	}
	
	public int getElemY()
	{
		return yElemCoord;
	}
	
	public int getSubX()
	{
		return xSubCoord;
	}
	
	public int getSubY()
	{
		return ySubCoord;
	}
}
