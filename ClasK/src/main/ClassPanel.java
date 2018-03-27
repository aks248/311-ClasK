/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.*;
import javax.swing.*;

public class ClassPanel extends JPanel{
    
    JButton enterLectureBtn, logOutBtn;
    JLabel roomLabel, lecturePassLabel, roomSelectLabel, loggedInLabel;
    JPasswordField lectPassText;
    JComboBox roomNumCombo;
    GridBagConstraints cp = new GridBagConstraints();
    
    ClassPanel(){
        super();
        this.setLayout(new GridBagLayout());
        this.setSize (500, 350);
        
        this.setBackground(Color.lightGray);
        enterLectureBtn = new JButton("Enter Lecture");
        logOutBtn = new JButton("Log Out");
        
        roomNumCombo = new JComboBox();
        roomNumCombo.addItem("1");
        roomNumCombo.addItem("2");
        roomNumCombo.addItem("3");
        roomNumCombo.addItem("4");
        roomNumCombo.addItem("5");
        roomNumCombo.addItem("6");
        
        lectPassText = new JPasswordField();
        
        roomSelectLabel = new JLabel("Please select room");
        roomLabel = new JLabel("ClasK Room");
        lecturePassLabel = new JLabel("Lecture Password");
        loggedInLabel = new JLabel("You've successfully logged in");
        
        Font labelsFont = new Font("Serif", Font.PLAIN, 25);
        Font welcomeFont = new Font("Serif", Font.BOLD, 50);
        loggedInLabel.setFont(welcomeFont);
        roomSelectLabel.setFont(labelsFont);
        roomLabel.setFont(labelsFont);
        lecturePassLabel.setFont(labelsFont);
        enterLectureBtn.setFont(labelsFont);
        logOutBtn.setFont(labelsFont);
        
        
        loggedInLabel.setSize(30, 20);
        roomSelectLabel.setSize(30, 20);
        roomLabel.setSize(30, 20);
        lecturePassLabel.setSize(30, 20);
        roomNumCombo.setSize(30, 20);
        lectPassText.setSize(30, 20);
        
        enterLectureBtn.setSize(30, 20);
        logOutBtn.setSize(30, 20);
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 1;
        cp.gridy = 0;
        cp.gridwidth = 3;
        this.add(loggedInLabel, cp);
        
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 1;
        cp.gridy = 1;
        cp.anchor = GridBagConstraints.EAST;
        cp.gridwidth = 2;
        this.add(roomSelectLabel,cp );
        
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 0;
        cp.gridy = 4;
        this.add(roomLabel, cp);
        
        
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 0;
        cp.gridy = 6;
        this.add(lecturePassLabel, cp);
        
        cp.fill = GridBagConstraints.BOTH;
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 2;
        cp.gridy = 4;
        this.add(roomNumCombo, cp);
        
        cp.fill = GridBagConstraints.BOTH;
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 2;
        cp.gridy = 6;
        this.add(lectPassText, cp);
        
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 2;
        cp.gridy = 8;
        this.add(enterLectureBtn, cp);
        
        cp.insets = new Insets(10,10,10,10);
        cp.gridx = 0;
        cp.gridy = 8;
        this.add(logOutBtn, cp);
       
        this.setVisible(true);
    }
    
    public void getRoomLoginFailed(){
        
        //this.roomSelectLabel.setText("Invalid Room Number or Password");
        //this.roomSelectLabel.setForeground(Color.RED);
        JOptionPane.showMessageDialog(this,"Invalid Room Number or Password\n" + "Please try again","Class Login Error",JOptionPane.ERROR_MESSAGE);
        this.repaint();
    }
    
}
