
public class SubBoard 
{
	private BoardElement[3][3] littleBoard;
	private boolean boardWon;
	private Player winner;
	
	public SubBoard()
	{
		littleBoard = new BoardElement[3][3];
		winner = null;
		boardWon = false;
	}
	
	public BoardElement getBoardElement(int x, int y)
	{
		return littleBoard[x][y];
	}
	
	public void checkForWin())
	{
		for(int i = 0; i<3; i++)
		{
			if(littleBoard[i][0].getPlayerAnswered() != null)
			{
				if(littleBoard[i][0].getPlayerAnswered()==littleBoard[i][1].getPlayerAnswered()==littleBoard[i][2].getPlayerAnswered())
				{
					boardWon = true;
					winner = littleBoard[i][0].getPlayerAnswered();
					return;
				}
			}
		}
		for(int i = 0; i<3; i++)
		{
			if(littleBoard[0][i].getPlayerAnswered() != null)
			{
				if(littleBoard[0][i].getPlayerAnswered()==littleBoard[1][i].getPlayerAnswered()==littleBoard[2][i].getPlayerAnswered())
				{
					boardWon = true;
					winner = littleBoard[0][i].getPlayerAnswered();
					return;
				}
			}
		}
		if(littleBoard[1][1]==null)
			return;
		if(littleBoard[0][0].getPlayerAnswered()==littleBoard[1][1].getPlayerAnswered()==littleBoard[2][2].getPlayerAnswered())
		{
			boardWon = true;;
			winner = littleBoard[1][1].getPlayerAnswered();
			return;
		}
		if(littleBoard[2][0].getPlayerAnswered()==littleBoard[1][1].getPLayerAnswered()==littleBoard[0][2].getPlayerAnswered())
		{
			boardWon = true;
			winner = littleBoard[1][1].getPlayerAnswered();
			return;
		}
	}
}
