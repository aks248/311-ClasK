package main;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopicPanel extends JPanel{
    
    JLabel topicLabel;
    
    TopicPanel(){
        topicLabel = new JLabel("Topics");
        add(topicLabel);
        
    }
    
}
