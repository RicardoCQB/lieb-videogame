package game;

public class Game {

	private final Renderer renderer;
	
	private final Scene scene;
	
	private boolean sceneChanged;
	
	public Game( ) {
		renderer = new Renderer();
		scene = new Scene();
		
	}
	
	
}
