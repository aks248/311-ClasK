package main;

/**
 *
 * @author Adam
 */

import java.awt.event.*;
import javax.swing.event.*;

public class UIController {
    
    private Model mod;
    private View view;
    private InitialPanel classPanel;
    private LoginPanel lp;
    
    private ActionListener loginListener;
    
    public UIController(Model m, View v) {
        mod = m;
        view = v;
        classPanel = view.getInitialFrame().getInitialPanel();
        lp = classPanel.getLoginPanel();
        implementListeners();
        lp.getSubmit().addActionListener(loginListener);
    }
    
    private void implementListeners() {
        loginListener = new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                String username = lp.getUserField().getText();
                String password = lp.getPassField().getText();
                int studentNumber = mod.getStudents().length;
                
                for(int i = 0; i < studentNumber; i++) {
                    if((username.equals(mod.getStudentById(i).getName())) && (password.equals(mod.getStudentById(i).getPassword()))) {
                        lp.login();
                        return;
                    }
                }
                lp.failLogin();
            }
        };
    }
}
