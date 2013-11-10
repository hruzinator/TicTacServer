package game;

public class Board 
{
	private SubBoard[][] bigBoard = new SubBoard[3][3];
	private SubBoard currentSubBoard = new SubBoard();
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
					setWinner(test);
					setGameOver(true);
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
					setWinner(test);
					setGameOver(true);
					return;
				}
			}
		}
		test = bigBoard[1][1].getWinner();
		if(test.equals(null))
			return;
		if(bigBoard[0][0].getWinner().equals(test) && bigBoard[2][2].getWinner().equals(test))
		{
			setWinner(test);
			setGameOver(true);
			return;
		}
		if(bigBoard[0][2].getWinner().equals(test) && bigBoard[2][0].getWinner().equals(test))
		{
			setWinner(test);
			setGameOver(true);
			return;
		}
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
}
