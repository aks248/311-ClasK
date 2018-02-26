package main;

/**
 *
 * @author Adam
 */

import java.awt.*;
import javax.swing.*;

public class LoginPanel extends JPanel {
    
    private InitialPanel classPanel;
    private JLabel title, logonLabel, userLabel, passLabel, idLabel;
    private JTextField userField, passField, idField;
    private JPanel logonPanel, submitPanel;
    private JButton submit;
    
    public LoginPanel(InitialPanel classPanel) {
        this.classPanel = classPanel;
        setBackground(ClaskColors.CLASK_GREY);
        setLayout(new GridLayout(4, 1));
        
        title = new JLabel("Welcome to ClasK", SwingConstants.CENTER);
        title.setForeground(ClaskColors.CLASK_WHITE);
        title.setFont(new Font("Serif", Font.PLAIN, 56));
        
        logonLabel = new JLabel("Student Logon", SwingConstants.CENTER);
        logonLabel.setForeground(ClaskColors.CLASK_WHITE);
        
        logonPanel = new JPanel();
        logonPanel.setBackground(ClaskColors.CLASK_GREY);
        logonPanel.setLayout(new GridLayout(6, 1));
        
        userLabel = new JLabel("Username:", SwingConstants.CENTER);
        userLabel.setForeground(ClaskColors.CLASK_WHITE);
        
        userField = new JTextField();
        userField.setHorizontalAlignment(JTextField.CENTER);
        
        passLabel = new JLabel("Password:", SwingConstants.CENTER);
        passLabel.setForeground(ClaskColors.CLASK_WHITE);
        
        passField = new JTextField();
        passField.setHorizontalAlignment(JTextField.CENTER);
        
        idLabel = new JLabel("Room ID:", SwingConstants.CENTER);
        idLabel.setForeground(ClaskColors.CLASK_WHITE);
        
        idField = new JTextField();
        idField.setHorizontalAlignment(JTextField.CENTER);
        
        logonPanel.add(userLabel);
        logonPanel.add(userField);
        logonPanel.add(passLabel);
        logonPanel.add(passField);
        logonPanel.add(idLabel);
        logonPanel.add(idField);
        
        submitPanel = new JPanel();
        submitPanel.setBackground(ClaskColors.CLASK_GREY);
        submitPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 300;
        
        submit = new JButton("Login");
        submitPanel.add(submit, c);
        
        add(title);
        add(logonLabel);
        add(logonPanel);
        add(submitPanel);
        
        classPanel.repaintAndValidate();
    }
    
    public void login() {
        classPanel.loadPanel(classPanel.getTopicViewPanel());
    }
    
    public void failLogin() {
        logonLabel.setForeground(ClaskColors.CLASK_RED);
        logonLabel.setText("Invalid Username or Password");
    }

    public JTextField getUserField() {
        return userField;
    }

    public JTextField getPassField() {
        return passField;
    }

    public JTextField getIdField() {
        return idField;
    }

    public JButton getSubmit() {
        return submit;
    }
    
}
