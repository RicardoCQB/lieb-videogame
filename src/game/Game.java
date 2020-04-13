package game;

import engine.IGameLogic;
import engine.Window;

public class Game implements IGameLogic{

	private final Renderer renderer;
	
	private boolean sceneChanged;
	
	public Game( ) {
		renderer = new Renderer();		
	}

	@Override
	public void init() throws Exception {
		renderer.init();		
	}

	@Override
	public void input(Window window) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float interval) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Window window) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cleanup() {
		// TODO Auto-generated method stub
		
	}
	
	
}
