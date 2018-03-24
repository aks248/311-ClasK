/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NavController {
    
    NavModel model;
    NavView view;
    
    NavController(NavModel bModel, NavView bView) {
        
        model = bModel;
        view = bView;
        view.initFrame.iPanel.getUserSelect();
        addUserSelectButtonListener();
        
    }
        public void addUserSelectButtonListener(){
        
        view.initFrame.iPanel.userSelect.instrBtn.addActionListener(new ActionListener()
        {
            @Override
                public void actionPerformed(ActionEvent event)
                {
                    model.userType = "i";                   
                    view.initFrame.iPanel.remove(view.initFrame.iPanel.userSelect);
                    view.initFrame.iPanel.getLogin();
                    view.initFrame.iPanel.login.stepLabel.setText("Instructor Login");
                    addLoginButtonListener();
                }
        });          
        
        view.initFrame.iPanel.userSelect.studentBtn.addActionListener(new ActionListener()
        {
            @Override
                public void actionPerformed(ActionEvent event)
                {
                    model.userType = "s";               
                    view.initFrame.iPanel.remove(view.initFrame.iPanel.userSelect);
                    view.initFrame.iPanel.getLogin();
                    view.initFrame.iPanel.login.stepLabel.setText("Student Login");
                    addLoginButtonListener();
                    
                }
        }); 
        
    }
    
    public void addLoginButtonListener(){
        
        view.initFrame.iPanel.login.loginBtn.addActionListener(new ActionListener()
        {
            @Override
                public void actionPerformed(ActionEvent event)
                {
                    String userEntered;
                    String passEntered;
                    userEntered = view.initFrame.iPanel.login.userText.getText();
                    passEntered = view.initFrame.iPanel.login.pswdText.getText();
                    
                switch (model.userType) {
                    case "s":
                        int studentNumber = model.getStudents().length;
                        boolean sValid = false;
                        for(int i = 0; i < studentNumber; i++) {
                            if(model.getStudentById(i).authenticate(userEntered, passEntered))
                            {
                                sValid = true;
                            }
                        }
                        if(sValid){
                            view.initFrame.iPanel.remove(view.initFrame.iPanel.login);
                            view.initFrame.iPanel.getLoginValidated();
                            addClassChooserListener();
                        }
                        else{
                            view.initFrame.iPanel.login.getLoginFailed();
                        }
                        
                        break;
                    case "i":
                        int instructorNumber = model.getInstructors().length;
                        boolean iValid = false;
                        for(int i = 0; i < instructorNumber; i++) {
                            if(model.getInstructorById(i).authenticate(userEntered, passEntered))
                            {
                                iValid = true;
                            }
                        }
                        if(iValid){
                                view.initFrame.iPanel.remove(view.initFrame.iPanel.login);
                                view.initFrame.iPanel.getLoginValidated();
                                addClassChooserListener();
                            }
                        else{    
                        view.initFrame.iPanel.login.getLoginFailed();
                        }
                        break;
                }
                    
                }
            });
        
        view.initFrame.iPanel.login.backBtn.addActionListener(new ActionListener()
        {
            @Override
                public void actionPerformed(ActionEvent event)
                {
                    view.initFrame.iPanel.remove(view.initFrame.iPanel.login);
                    view.initFrame.iPanel.getUserSelect();
                    addUserSelectButtonListener();
                    
                }
                });
        
        
            
    }
    
    public void addClassChooserListener(){
        
       view.initFrame.iPanel.classChooser.enterLectureBtn.addActionListener(new ActionListener()
        {
            @Override
                public void actionPerformed(ActionEvent event)
                {
                    String roomSelected;
                    String roomPassEntered;
                    roomSelected = (String) view.initFrame.iPanel.classChooser.roomNumCombo.getSelectedItem();
                    roomPassEntered = view.initFrame.iPanel.classChooser.lectPassText.getText();
                    System.out.println(roomSelected+" "+roomPassEntered);
                    int courseNumber = model.getCourses().length;
                    boolean rValid = false;
                    
                    for(int i = 0; i < courseNumber; i++) {
                        if(model.getCourseById(i).authenticate(roomSelected, roomPassEntered))
                        {
                            rValid = true;
                        }
                    }
                    if(rValid){
                            view.initFrame.iPanel.remove(view.initFrame.iPanel.classChooser);
                            view.initFrame.iPanel.remove(view.initFrame.iPanel.wp);
                            view.initFrame.iPanel.getRoomValidated();
                            return;
                    }
                    else{ 
                        view.initFrame.iPanel.classChooser.getRoomLoginFailed();
                    }    
                }
        }); 
       
       view.initFrame.iPanel.classChooser.logOutBtn.addActionListener(new ActionListener()
        {
            @Override
                public void actionPerformed(ActionEvent event)
                {
                switch (model.userType) {               
                    case "s":
                        view.initFrame.iPanel.remove(view.initFrame.iPanel.classChooser);
                        view.initFrame.iPanel.getLogin();
                        view.initFrame.iPanel.login.stepLabel.setText("Student Login");
                        addLoginButtonListener();
                        break;
                    case "i":               
                        view.initFrame.iPanel.remove(view.initFrame.iPanel.classChooser);
                        view.initFrame.iPanel.getLogin();
                        view.initFrame.iPanel.login.stepLabel.setText("Instructor Login");
                        addLoginButtonListener();
                        break;
                }
                }
        });
    }
    
}

