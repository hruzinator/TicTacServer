package game;

public class GameManager 
{
	private String currentQuestion = "";
	private Player player1;
	private Player player2;
	private GameState state;
	private int gameID;
	private boolean limited = true;
	
	public GameManager(String p1, String p2, int id) 
	{
		player1 = new Player(p1);
		player2 = new Player(p2);
		gameID = id;
		state = new GameState(gameID, player1, player2, new Board());
	}
	
	public boolean tryMove(int subx, int suby, int x, int y)
	{
		//false means BAD MOVE! true means sure, go right ahead.
		Board board = state.getGameBoard();
		if(limited)
		{
			SubBoard sub = board.getCurrentSubBoard();
			if(board.getSubBoard(subx, suby).equals(sub))
			{
				if(sub.getBoardElement(x, y).equals(null))
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
		{
			SubBoard sub = board.getSubBoard(subx, suby);
			if(!sub.isBoardWon())
			{
				if(sub.getBoardElement(x, y).equals(null))
					return true;
				else
					return false;
			}
			else
				return false;
		}
	}
	
	public void makeMove(int subx, int suby, int x, int y, Player p)
	{
		Board board = state.getGameBoard();
		SubBoard sub = board.getSubBoard(subx, suby);
		sub.setBoardElement(x, y, p);
		sub = board.getSubBoard(x, y);
		if(sub.isBoardWon())
			limited = false;
		else
		{
			limited = true;
			board.setCurrentSubBoard(x, y);
		}
	}
	
	protected boolean move(int subx, int suby, int x, int y, Player p, Question q, String answer)
	{
		if(tryMove(subx, suby, x, y) && q.attemptAnswer(answer))
		{
			makeMove(subx, suby, x, y, p);
			state.flipPlayer();
			return true;
		}
		return false;
	}
	
	public GameState getGameState()
	{
		return state;
	}

}
