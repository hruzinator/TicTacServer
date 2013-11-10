package game;

public class Board 
{
	private SubBoard[][] bigBoard = new SubBoard[3][3];
	private SubBoard currentSubBoard;
	private Player winner;
	private boolean gameOver = false;
	
	public Board()
	{
		bigBoard = new SubBoard[3][3];
		currentSubBoard = new SubBoard();
	}
	
	protected SubBoard getCurrentSubBoard()
	{
		return currentSubBoard;
	}
	
	protected void setCurrentSubBoard(int x, int y)
	{
		currentSubBoard = bigBoard[x][y];
	}
	
	protected boolean isLimited()
	{
		return limited;
	}
	
	public SubBoard getSubBoard(int x, int y)
	{
		return bigBoard[x][y];
	}
	
	public void checkForWin()
	{
		Player test;
		for(int i=0; i<3; i++)
		{
			test = bigBoard[0][i].getWinner();
			if(!test.equals(null))
			{
				if(bigBoard[1][i].getWinner().equals(test) && bigBoard[2][i].getWinner().equals(test))
				{
					winner = test;
					gameOver = true;
					return;
				}
			}
		}
		for(int i=0; i<3; i++)
		{
			test = bigBoard[i][0].getWinner();
			if(!test.equals(null))
			{
				if(bigBoard[i][1].getWinner().equals(test) && bigBoard[i][2].getWinner().equals(test))
				{
					winner = test;
					gameOver = true;
					return;
				}
			}
		}
		test = bigBoard[1][1].getWinner();
		if(test.equals(null))
			return;
		if(bigBoard[0][0].getWinner().equals(test) && bigBoard[2][2].getWinner().equals(test))
		{
			winner = test;
			gameOver = true;
			return;
		}
		if(bigBoard[0][2].getWinner().equals(test) && bigBoard[2][0].getWinner().equals(test))
		{
			winner = test;
			gameOver = true;
			return;
		}
	}
}
