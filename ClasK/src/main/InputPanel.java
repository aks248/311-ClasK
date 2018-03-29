package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class InputPanel extends JPanel{
    
    NavModel model;
    JPanel helpPanel;
    JPanel msgBoxPanel;
    JLabel msgBoxLabel;
    JButton afterClass, help, emailInst, subQuest, subAnswr;
    JTextField messageBox;
    GridBagConstraints iP = new GridBagConstraints();
    Font labelsFont = new Font("Serif", Font.PLAIN, 16);
    
    InputPanel(NavModel iPModel){
        super();
        model = iPModel;
        this.setLayout(new GridLayout(1, 2, 0, 10));
        this.setSize(1800, 300);
        createHelpPanel();
        createMsgBoxPanel();
    }
    
    public void createMsgBoxPanel(){
        msgBoxPanel = new JPanel();
        msgBoxPanel.setLayout(new GridBagLayout());
        msgBoxPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        msgBoxLabel = new JLabel("Enter message in box below.");
        msgBoxLabel.setFont(labelsFont);
        subQuest = new JButton("Submit Question");
        subAnswr = new JButton("Answer Question");
        messageBox = new JTextField("-Enter message here-");
        
    /*  iP.gridx = 0;
        iP.gridy = 0;
        iP.weightx = 1;
        iP.gridwidth = 1;
        msgBoxPanel.add(msgBoxLabel, iP);
        
        iP.gridx = 0;
        iP.gridy = 1;
        iP.weightx = 1;
        iP.gridheight = 2;
        iP.gridwidth = 2;
        msgBoxPanel.add(messageBox, iP);    */
        
        iP.gridx = 2;
        iP.gridy = 1;
        iP.weightx = 1;
        msgBoxPanel.add(subQuest, iP);
        
        iP.gridx = 2;
        iP.gridy = 2;
        iP.weightx = 1;
        msgBoxPanel.add(subAnswr, iP);
        
        this.add(msgBoxPanel);
        
    }
    
    public void createHelpPanel(){
        helpPanel = new JPanel();
        helpPanel.setLayout(new GridBagLayout());
        helpPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        afterClass = new JButton("After Class");
        subAnswr = new JButton("Help");
        emailInst = new JButton("Instructor Email");
        
        iP.gridx = 1;
        iP.gridy = 1;
        iP.weightx = 1;
        helpPanel.add(afterClass, iP);
        
        iP.gridx = 2;
        iP.gridy = 1;
        iP.weightx = 1;
        helpPanel.add(subAnswr, iP);
        
        iP.gridx = 3;
        iP.gridy = 1;
        iP.weightx = 1;
        helpPanel.add(emailInst, iP);
        
        this.add(helpPanel);
        
    }
    
}
