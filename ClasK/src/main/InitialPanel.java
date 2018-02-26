package main;

/**
 *
 * @author Adam
 */

import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel {
    
    private InitialFrame cjf;
    private LoginPanel lp;
    private TopicViewPanel tvp;
    
    public InitialPanel(InitialFrame cjf) {
        super();
        this.cjf = cjf;
        setLayout(new GridLayout(1,1));
        lp = new LoginPanel(this);
        tvp = new TopicViewPanel(this);
        loadPanel(lp);
    }
    
    public void loadPanel(JPanel panel) {
        removeAll();
        add(panel);
        repaintAndValidate();
    }
    
    public LoginPanel getLoginPanel() {
        return lp;
    }
    
    public TopicViewPanel getTopicViewPanel() {
        return tvp;
    }
    
    public void repaintAndValidate() {
        repaint();
        revalidate();
    }
}
