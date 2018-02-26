package main;

/**
 *
 * @author Adam
 */
public class View {
    
    private Model mod;
    private ClassJFrame CJ;
    
    public View(Model m) {
        mod = m;
        CJ = new ClassJFrame(this);
    }
    
    public Model getModel() {
        return mod;
    }
}
