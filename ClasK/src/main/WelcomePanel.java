package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WelcomePanel extends JPanel{
    
    JLabel welcomeLabel;
    
    WelcomePanel(){
        super();
        
        welcomeLabel = new JLabel("Welcome to ClasK");
        welcomeLabel.setBounds(530,140, 820, 75);
        Font welcomeFont = new Font("Serif", Font.BOLD, 86);
        welcomeLabel.setForeground(Color.BLUE);
        welcomeLabel.setFont(welcomeFont);
        add(welcomeLabel);
        
    }    
}
