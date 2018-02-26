package main;

/**
 *
 * @author Adam
 */

import java.awt.*;
import javax.swing.*;

public class ClassJPanel extends JPanel {
    
    ClassJFrame cjf;
    
    public ClassJPanel(ClassJFrame cjf) {
        super();
        this.cjf = cjf;
        setBackground(Color.RED);
    }
}
