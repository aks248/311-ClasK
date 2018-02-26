package main;

/**
 *
 * @author Adam
 */

public class View {
    
    private Model mod;
    private InitialFrame classFrame;
    
    public View(Model m) {
        mod = m;
        classFrame = new InitialFrame(this);
    }
    
    public InitialFrame getInitialFrame() {
        return classFrame;
    }
    
    public Model getModel() {
        return mod;
    }
}
