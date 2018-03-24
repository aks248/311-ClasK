package main;

class NavView {

    NavModel model;
    InitialFrame initFrame;
    
    NavView(NavModel bModel){
        model = bModel;
        initFrame = new InitialFrame();
        
    }
}
