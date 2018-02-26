package main;

/**
 *
 * @author Adam
 */

import java.awt.*;
import javax.swing.*;

public class TopicViewPanel extends JPanel {
    
    InitialPanel classPanel;
    JLabel welcome;
    JButton sessionStart;
    JPanel lowerPane;
    
    public TopicViewPanel(InitialPanel classPanel) {
        this.classPanel = classPanel;
        setBackground(ClaskColors.CLASK_GREY);
        setLayout(new GridLayout(2, 1));
        welcome = new JLabel("Login Successful!", SwingConstants.CENTER);
        welcome.setForeground(ClaskColors.CLASK_WHITE);
        welcome.setFont(new Font("Serif", Font.PLAIN, 56));
        
        sessionStart = new JButton("Start Session");
        
        lowerPane = new JPanel();
        lowerPane.setBackground(ClaskColors.CLASK_GREY);
        lowerPane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.CENTER;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 300;
        lowerPane.add(sessionStart, c);
        
        add(welcome);
        add(lowerPane);
        
    }
}
