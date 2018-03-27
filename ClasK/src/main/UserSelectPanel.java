/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserSelectPanel extends JPanel{
    
    JButton studentBtn, instrBtn;
    JLabel welcomeLabel, selectLabel;
    
    UserSelectPanel(){
        super();
        this.setSize (1800, 895);
        setLayout(null);
        this.setBackground(Color.lightGray);
        
        selectLabel = new JLabel("Select Login Type");
        studentBtn = new JButton("Student Login");
        instrBtn = new JButton("Instructor Login");
        
        selectLabel.setBounds(750, 200, 280, 55);
        studentBtn.setBounds(420, 420, 300, 55);
        instrBtn.setBounds(1000, 420, 300, 55);
        
        Font labelsFont = new Font("Serif", Font.PLAIN, 34);
        
        selectLabel.setFont(labelsFont);
        studentBtn.setFont(labelsFont);
        instrBtn.setFont(labelsFont);
        
        this.add(selectLabel);
        this.add(studentBtn);
        this.add(instrBtn);
        
        this.setVisible(true);
        
    }
    
}
