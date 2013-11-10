package game;

public class Board 
{
	private SubBoard[][] bigBoard = new SubBoard[3][3];
	private SubBoard currentSubBoard;
	
	public Board()
	{
		bigBoard = new SubBoard[3][3];
		currentSubBoard = new SubBoard();
	}
	
	public SubBoard getCurrentSubBoard()
	{
		return currentSubBoard;
	}
	
	public SubBoard getSubBoard(int x, int y)
	{
		return bigBoard[x][y];
	}
	
	public void checkForWin()
	{
		//needs to happen next
	}
}
