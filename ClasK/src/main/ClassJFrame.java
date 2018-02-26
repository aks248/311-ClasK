package main;

/**
 *
 * @author Adam
 */

import java.awt.*;
import javax.swing.*;

public class ClassJFrame extends JFrame {
    private ClassJPanel cjp;
    private View view;
    
    public ClassJFrame(View a) {
        super("ClasK");
        view = a;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 960);
        setResizable(true);
        setVisible(true);
        cjp = new ClassJPanel(this);
        add(cjp);
        
        /*
        Sets the appearance of the interface to match the base OS one, if possible
        */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    
    public ClassJPanel getClassJPanel() {
        return cjp;
    }
    
    public Model getModel() {
        return view.getModel();
    }
    
}
