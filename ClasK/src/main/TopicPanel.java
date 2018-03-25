package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class TopicPanel extends JPanel{
    
    JLabel topicLabel;
    JButton topic1,topic2,topic3;
    JRadioButton t1Y, t1N, t2Y, t2N, t3Y, t3N;
    ButtonGroup tp1Group, tp2Group, tp3Group;
    
    //GridBagConstraints tpc = new GridBagConstraints();
    
    TopicPanel(){
        super();
        this.setLayout(null);
        this.setSize (900, 500);
        
        this.setBackground(Color.lightGray);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        
        topicLabel = new JLabel("Topics");
        topicLabel.setBounds(450, 5, 50, 25);
        topic1 = new JButton("Topic1");
        topic2 = new JButton("Topic2");
        topic3 = new JButton("Topic3");
        
        topic1.setBounds(5, 30, 700, 50);
        topic2.setBounds(5, 90, 700, 50);
        topic3.setBounds(5, 150, 700, 50);
        
        this.add(topicLabel);
        this.add(topic1);       
        this.add(topic2);        
        this.add(topic3);
        
        createRadioButtons();
        
        
        
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
        t1Y.setBounds(710, 30, 175, 20);
        t1N.setBounds(710, 55, 175, 20);
        
        this.add(t1Y);
        this.add(t1N);
        
        
        t2Y = new JRadioButton("Understand");
        t2Y.setMnemonic(KeyEvent.VK_C);
        tp2Group = new ButtonGroup();
        t2N = new JRadioButton("Don't Understand");
        t2N.setMnemonic(KeyEvent.VK_D);    
        tp2Group.add(t2Y);
        tp2Group.add(t2N);
        t2Y.setBounds(710, 90, 175, 20);
        t2N.setBounds(710, 115, 175, 20);
        this.add(t2Y);
        this.add(t2N);
        
        t3Y = new JRadioButton("Understand");
        t3Y.setMnemonic(KeyEvent.VK_E);
        t3N = new JRadioButton("Don't Understand");
        t3N.setMnemonic(KeyEvent.VK_F);
        tp3Group = new ButtonGroup();
        tp3Group.add(t3Y);
        tp3Group.add(t3N);
        t3Y.setBounds(710, 150, 175, 20);
        t3N.setBounds(710, 175, 175, 20);
        
        this.add(t3Y);
        this.add(t3N);
        
    }
    
}
