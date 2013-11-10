package game;

public class GameState {
	private Player currentPlayer;
	private Player[] allPlayers = new Player[2];
	Board gameBoard;
	QuestionManager qManager;
	
	public GameState() {
		super();
	}
	
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	public Player[] getAllPlayers() {
		return allPlayers;
	}
	public Board getGameBoard() {
		return gameBoard;
	}
	public QuestionManager getqManager() {
		return qManager;
	}
	void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	void setAllPlayers(Player[] allPlayers) {
		this.allPlayers = allPlayers;
	}
	void setGameBoard(Board gameBoard) {
		this.gameBoard = gameBoard;
	}
	void setqManager(QuestionManager qManager) {
		this.qManager = qManager;
	}
}
