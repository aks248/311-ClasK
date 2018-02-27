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
        classFrame = new InitialFrame(this); //Inserting self-reference allows subclasses to access Model via View.getModel()
    }
    
    public InitialFrame getInitialFrame() {
        return classFrame;
    }
    
    public Model getModel() {
        return mod;
    }
}
