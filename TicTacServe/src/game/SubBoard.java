package game;

public class SubBoard 
{
	private BoardElement[][] littleBoard;
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
	
	protected void setBoardElement(int x, int y, Player p)
	{
		littleBoard[x][y].setAnswered(p);
		checkForWin();
	}
	
	public Player getWinner()
	{
		return winner;
	}
	
	public boolean isBoardWon()
	{
		return boardWon;
	}

	public void checkForWin()
	{
		for(int i = 0; i<3; i++)
		{
			if(littleBoard[i][0].getPlayerAnswered() != null)
			{
				if(littleBoard[i][0].getPlayerAnswered().equals(littleBoard[i][1].getPlayerAnswered()==littleBoard[i][2].getPlayerAnswered()))
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
				if(littleBoard[0][i].getPlayerAnswered().equals(littleBoard[1][i].getPlayerAnswered()==littleBoard[2][i].getPlayerAnswered()))
				{
					boardWon = true;
					winner = littleBoard[0][i].getPlayerAnswered();
					return;
				}
			}
		}
		if(littleBoard[1][1]==null){
			return;
		}
		if(littleBoard[0][0].getPlayerAnswered().equals(littleBoard[1][1].getPlayerAnswered()==littleBoard[2][2].getPlayerAnswered()))
		{
			boardWon = true;;
			winner = littleBoard[1][1].getPlayerAnswered();
			return;
		}
		if(littleBoard[2][0].getPlayerAnswered().equals(littleBoard[1][1].getPlayerAnswered()) && littleBoard[2][0].getPlayerAnswered().equals(littleBoard[0][2].getPlayerAnswered()))
		{
			boardWon = true;
			winner = littleBoard[1][1].getPlayerAnswered();
			return;
		}
	}
}
