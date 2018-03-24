package main;

public class app {
    
    public static NavModel model;
    public static NavView view;
    public static NavController controller;

    public static void main(String[] args) 
    {
        model = new NavModel();
        view = new NavView(model);
        controller = new NavController(model, view);
        
    }
    
}