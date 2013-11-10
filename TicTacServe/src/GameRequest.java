
public class GameRequest {
	GameState gs;
	GameManager gm;
	
	public GameManager startGame(String p1, String p2){
		gm = new GameManager(p1, p2);
		return gm;
	}
	
	public GameState getGameState(){
		return gs;
	}
	
	public GameManager getGameManager(){
		return gm;
	}
	
	public void endGame(){
		//test for Mariano
	}
}
