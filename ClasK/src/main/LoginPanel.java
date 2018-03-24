package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel{
    
    JButton loginBtn, backBtn;
    JTextField userText;
    JPasswordField pswdText;
    JLabel userLabel, pswdLabel, stepLabel, msgLabel;
    GridBagConstraints lpc = new GridBagConstraints();
    //int v, h;
    
    
    LoginPanel(){
        super();
        this.setLayout(new GridBagLayout());
        this.setSize (500, 350);
        
        this.setBackground(Color.lightGray);
        
        loginBtn = new JButton("Login");
        backBtn = new JButton("Back");
        
        userText = new JTextField();
        pswdText = new JPasswordField();
        
        msgLabel = new JLabel("Login to continue");
        userLabel = new JLabel("Username");
        pswdLabel = new JLabel("Password");
        stepLabel = new JLabel("ClasK");
        
        Font labelsFont = new Font("Serif", Font.PLAIN, 25);
        Font welcomeFont = new Font("Serif", Font.BOLD, 50);
        stepLabel.setFont(welcomeFont);
        msgLabel.setFont(labelsFont);
        userLabel.setFont(labelsFont);
        pswdLabel.setFont(labelsFont);
        loginBtn.setFont(labelsFont);
        backBtn.setFont(labelsFont);
        
        stepLabel.setSize(30, 20);
        msgLabel.setSize(30, 20);
        userLabel.setSize(30, 20);
        pswdLabel.setSize(30, 20);
        userText.setSize(30, 30);
        pswdText.setSize(30, 30);
        
        loginBtn.setSize(30, 25);
        backBtn.setSize(30, 25);
        
       
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 1;
        lpc.gridy = 0;
        lpc.gridwidth = 2;
        this.add(stepLabel, lpc);
        
        
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 1;
        lpc.gridy = 2;
        lpc.gridwidth = 2;
        this.add(msgLabel, lpc);
        
       
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 0;
        lpc.gridy = 4;
        this.add(userLabel, lpc);
        
        
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 0;
        lpc.gridy = 6;
        this.add(pswdLabel, lpc);
        
        lpc.fill = GridBagConstraints.BOTH;
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 2;
        lpc.gridy = 4;
        this.add(userText, lpc);
        
        lpc.fill = GridBagConstraints.BOTH;
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 2;
        lpc.gridy = 6;
        this.add(pswdText, lpc);
        
        
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 2;
        lpc.gridy = 8;
        this.add(loginBtn, lpc);
        
       
        lpc.insets = new Insets(10,10,10,10);
        lpc.gridx = 0;
        lpc.gridy = 8;
        this.add(backBtn, lpc);
        repaint();
        this.setVisible(true);
    }
    
    public void getLoginFailed(){
        //this.msgLabel.setSize(20,70);
        //this.msgLabel.setText("Invalid Username or Password");
        //this.msgLabel.setForeground(Color.RED);
        JOptionPane.showMessageDialog(this,"Invalid Username or Password\n" + "Please try again.","Login Error",JOptionPane.ERROR_MESSAGE);
        this.repaint();
        
    }
}
