package game;

public class GameState {
	private final int GAME_ID;
	private Player[] allPlayers = new Player[2];
	Board gameBoard;
	QuestionManager qManager;
	private Player currentPlayer;
	boolean isOver = false;
	
	public GameState(int gameID, Player p1, Player p2, Board b) {
		GAME_ID = gameID;
		allPlayers[0] = p1;
		allPlayers[1] = p2;
		gameBoard = b;
	}
	
	void flipPlayer(){
		if(currentPlayer.equals(allPlayers[0])){
			currentPlayer = allPlayers[1];
		}
		else{
			currentPlayer = allPlayers[0];
		}
	}
	
	int getGAME_ID() {
		return GAME_ID;
	}

	Player[] getAllPlayers() {
		return allPlayers;
	}

	Board getGameBoard() {
		return gameBoard;
	}

	QuestionManager getqManager() {
		return qManager;
	}

	Player getCurrentPlayer() {
		return currentPlayer;
	}

	boolean isOver() {
		return isOver;
	}

	void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	void setOver(boolean isOver) {
		this.isOver = isOver;
	}

	Player getPlayer1(){
		return allPlayers[0];
	}
	
	Player getPlayer2(){
		return allPlayers[1];
	}
}
