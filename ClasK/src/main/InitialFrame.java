package main;

/**
 *
 * @author Adam
 */

import java.awt.*;
import javax.swing.*;

public class InitialFrame extends JFrame {
    private InitialPanel classPanel;
    private View view;
    

    
    public InitialFrame(View a) {
        super("ClasK");
        view = a;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 960);
        setResizable(true);
        setVisible(true);
        classPanel = new InitialPanel(this);
        add(classPanel);
        
        /*
        Sets the appearance of the interface to match the base OS one, if possible
        */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        classPanel.repaintAndValidate();
    }
    
    public InitialPanel getInitialPanel() {
        return classPanel;
    }
    
    public Model getModel() {
        return view.getModel();
    }
    
}
