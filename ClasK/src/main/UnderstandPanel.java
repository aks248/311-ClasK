package main;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class UnderstandPanel extends JPanel{
    
    JRadioButton t1Y, t1N, t2Y, t2N, t3Y, t3N, t4Y, t4N, t5Y, t5N,
            t6Y, t6N, t7Y, t7N;
    ButtonGroup tp1Group, tp2Group, tp3Group, tp4Group, tp5Group, tp6Group,
            tp7Group;
    JPanel gp1, gp2, gp3, gp4, gp5, gp6, gp7;
    
    UnderstandPanel(){
        super();
        this.setLayout(new GridLayout(7, 1, 0, 10));
        this.setSize(100, 500);
        createRadioButtons();
        addAllButtonGroups();
        revalidate();
        repaint();
        this.setVisible(true);
        
        
    }
    
    public void createRadioButtons(){
        
        t1Y = new JRadioButton("Understand");
        t1Y.setMnemonic(KeyEvent.VK_A);
        t1N = new JRadioButton("Don't Understand");
        t1N.setMnemonic(KeyEvent.VK_B);
        tp1Group = new ButtonGroup();
        tp1Group.add(t1Y);
        tp1Group.add(t1N);
        t1Y.setBackground(Color.green);
        t1N.setBackground(Color.RED);              
        
        t2Y = new JRadioButton("Understand");
        t2Y.setMnemonic(KeyEvent.VK_C);
        tp2Group = new ButtonGroup();
        t2N = new JRadioButton("Don't Understand");
        t2N.setMnemonic(KeyEvent.VK_D);    
        tp2Group.add(t2Y);
        tp2Group.add(t2N);
        t2Y.setBackground(Color.green);
        t2N.setBackground(Color.RED);
        
        t3Y = new JRadioButton("Understand");
        t3Y.setMnemonic(KeyEvent.VK_E);
        t3N = new JRadioButton("Don't Understand");
        t3N.setMnemonic(KeyEvent.VK_F);
        tp3Group = new ButtonGroup();
        tp3Group.add(t3Y);
        tp3Group.add(t3N);
        t3Y.setBackground(Color.green);
        t3N.setBackground(Color.RED);
        
        t4Y = new JRadioButton("Understand");
        t4Y.setMnemonic(KeyEvent.VK_E);
        t4N = new JRadioButton("Don't Understand");
        t4N.setMnemonic(KeyEvent.VK_F);
        tp4Group = new ButtonGroup();
        tp4Group.add(t4Y);
        tp4Group.add(t4N);
        t4Y.setBackground(Color.green);
        t4N.setBackground(Color.RED);
        
        t5Y = new JRadioButton("Understand");
        t5Y.setMnemonic(KeyEvent.VK_E);
        t5N = new JRadioButton("Don't Understand");
        t5N.setMnemonic(KeyEvent.VK_F);
        tp5Group = new ButtonGroup();
        tp5Group.add(t5Y);
        tp5Group.add(t5N);
        t5Y.setBackground(Color.green);
        t5N.setBackground(Color.RED);
        
        t6Y = new JRadioButton("Understand");
        t6Y.setMnemonic(KeyEvent.VK_E);
        t6N = new JRadioButton("Don't Understand");
        t6N.setMnemonic(KeyEvent.VK_F);
        tp6Group = new ButtonGroup();
        tp6Group.add(t6Y);
        tp6Group.add(t6N);
        t6Y.setBackground(Color.green);
        t6N.setBackground(Color.RED);
        
        t7Y = new JRadioButton("Understand");
        t7Y.setMnemonic(KeyEvent.VK_E);
        t7N = new JRadioButton("Don't Understand");
        t7N.setMnemonic(KeyEvent.VK_F);
        tp7Group = new ButtonGroup();
        tp7Group.add(t7Y);
        tp7Group.add(t7N);
        t7Y.setBackground(Color.green);
        t7N.setBackground(Color.RED);
    }
    
    public void addTopic1Buttons(){
        gp1 = new JPanel();
        gp1.setLayout(new GridLayout(2, 1));
        gp1.add(t1Y);
        gp1.add(t1N);
        this.add(gp1);
    }
    
    public void addTopic2Buttons(){
        gp2 = new JPanel();
        gp2.setLayout(new GridLayout(2, 1));
        gp2.add(t2Y);
        gp2.add(t2N);
        this.add(gp2);
    }
    
    public void addTopic3Buttons(){
        gp3 = new JPanel();
        gp3.setLayout(new GridLayout(2, 1));
        gp3.add(t3Y);
        gp3.add(t3N);
        this.add(gp3);
    }
    public void addTopic4Buttons(){
        gp4 = new JPanel();
        gp4.setLayout(new GridLayout(2, 1));
        gp4.add(t4Y);
        gp4.add(t4N);
        this.add(gp4);
    }
    
    public void addTopic5Buttons(){
        gp5 = new JPanel();
        gp5.setLayout(new GridLayout(2, 1));
        gp5.add(t5Y);
        gp5.add(t5N);
        this.add(gp5);
    }
    
    public void addTopic6Buttons(){
        gp6 = new JPanel();
        gp6.setLayout(new GridLayout(2, 1));
        gp6.add(t6Y);
        gp6.add(t6N);
        this.add(gp6);
    }
    
    public void addTopic7Buttons(){
        gp7 = new JPanel();
        gp7.setLayout(new GridLayout(2, 1));
        gp7.add(t7Y);
        gp7.add(t7N);
        this.add(gp7);
    }
    
    public void addAllButtonGroups(){
        addTopic1Buttons();
        addTopic2Buttons();
        addTopic3Buttons();
        addTopic4Buttons();
        addTopic5Buttons();
        addTopic6Buttons();
        addTopic7Buttons();
    }
    
}
