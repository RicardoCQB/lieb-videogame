package engine;


/*
 * This interface serves to unite the other classes that have to init, update and render, etc...
 */
public interface IGameLogic {

    void init() throws Exception;
    
    void input(Window window);

    void update(float interval);
    
    void render(Window window);
    
    void cleanup();
}