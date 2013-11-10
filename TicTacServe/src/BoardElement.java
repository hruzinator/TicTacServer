
public class BoardElement 
{
	private boolean isAnswered;
	private Player playerAnswered;
	
	public BoardElement()
	{
		isAnswered = false;
		playerAnswered = null;
	}
	
	public void setAnswered(Player p)
	{
		isAnswered = true;
		playerAnswered = p;
	}
	
	public boolean isAnswered()
	{
		return isAnswered;
	}
	
	public void setPlayerAnswered(Player p)
	{
		playerAnswered = p;
	}
	
	public Player getPlayerAnswered()
	{
		return player;
	}
}
