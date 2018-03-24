package main;

import java.awt.Color;
import javax.swing.JFrame;

class InitialFrame extends JFrame {
    
    InitialPanel iPanel;
    
    public InitialFrame(){
        super("Clask");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize (1800, 980);
        this.setBackground(Color.lightGray);
        iPanel = new InitialPanel();
        add(iPanel);
        this.setVisible(true);        
    }
}
