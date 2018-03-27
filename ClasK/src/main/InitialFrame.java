package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

class InitialFrame extends JFrame {
    
    InitialPanel iPanel;
    
    public InitialFrame(){
        super("Clask");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //sets to full screen windowed for any screen resolution
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        
        this.setBackground(Color.lightGray);
        iPanel = new InitialPanel();
        add(iPanel);
        this.setVisible(true);        
    }
}
