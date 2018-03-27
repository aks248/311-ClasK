package main;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

class InitialPanel extends JPanel {
    
    LoginPanel login;
    ClassPanel classChooser;
    UserSelectPanel userSelect;
    WelcomePanel wp;
    TopicPanel topPanel;

    InitialPanel(){
        super();
        this.setBackground(Color.BLUE);
        setLayout(new BorderLayout());
        wp = new WelcomePanel();
        add(wp, BorderLayout.NORTH);
        
        this.repaint();
        this.setVisible(true);
        
        
    }
    
    public void getLogin(){
        
        
        login = new LoginPanel();
        
        add(login, BorderLayout.CENTER);
        this.repaint();
        revalidate();
        this.setVisible(true);
        
    }
    
    public void getLoginValidated(){
        
        classChooser = new ClassPanel();
        
        add(classChooser, BorderLayout.CENTER);
        this.repaint();
        revalidate();
        this.setVisible(true);
    }
    
    public void getUserSelect(){
     
        
        
        userSelect = new UserSelectPanel();
        
        add(userSelect, BorderLayout.CENTER);
        this.repaint();
        revalidate();
        this.setVisible(true);
    }
    
    public void getRoomValidated(){
        
        topPanel = new TopicPanel();
        add(topPanel, BorderLayout.CENTER);
        this.repaint();
        revalidate();
        this.setVisible(true);
        
    }
    
    
          
}

    

