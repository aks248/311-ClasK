package main;

public class app {

    public static Model mod;
    public static View view;
    public static UIController control;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mod = new Model();
        view = new View(mod);
        control = new UIController(mod, view);
    }
    
}
