package game;

public class GameState {
	private final int GAME_ID;
	private Player[] allPlayers = new Player[2];
	private Board gameBoard;
	private QuestionManager qManager;
	private Player currentPlayer;
	private boolean isOver = false;
	private int lastX;
	private int lastY;
	private int lastSubX;
	private int lastSubY;
	
	int getLastX() {
		return lastX;
	}

	int getLastY() {
		return lastY;
	}

	int getLastSubX() {
		return lastSubX;
	}

	int getLastSubY() {
		return lastSubY;
	}

	void setLastX(int lastX) {
		this.lastX = lastX;
	}

	void setLastY(int lastY) {
		this.lastY = lastY;
	}

	void setLastSubX(int lastSubX) {
		this.lastSubX = lastSubX;
	}

	void setLastSubY(int lastSubY) {
		this.lastSubY = lastSubY;
	}

	public GameState(int gameID, Player p1, Player p2, Board b) {
		GAME_ID = gameID;
		allPlayers[0] = p1;
		allPlayers[1] = p2;
		gameBoard = b;
	}
	
	public void flipPlayer(){
		if(currentPlayer.equals(allPlayers[0])){
			currentPlayer = allPlayers[1];
		}
		else{
			currentPlayer = allPlayers[0];
		}
	}
	
	public int getGAME_ID() {
		return GAME_ID;
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

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public boolean isOver() {
		return isOver;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public void setOver(boolean isOver) {
		this.isOver = isOver;
	}

	public Player getPlayer1(){
		return allPlayers[0];
	}
	
	public Player getPlayer2(){
		return allPlayers[1];
	}
}
