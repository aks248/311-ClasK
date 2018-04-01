/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Course {
    
    private final StringProperty crsName;
    private final StringProperty rmNum;
    private final StringProperty crsPassword;
    
    Course(String crsName, String rmNum, String crsPassword){
        
        this.crsName = new SimpleStringProperty(crsName);
        this.rmNum = new SimpleStringProperty(rmNum);
        this.crsPassword = new SimpleStringProperty(crsPassword);
    
    }
    
    boolean authenticate(String roomNum, String crsPswd){
        StringProperty room = new SimpleStringProperty(roomNum);
        StringProperty password = new SimpleStringProperty(crsPswd);
        
        boolean result = false;
        if((room.equals(rmNum)) && (password.equals(crsPassword))){
            result = true;
        }
        else;
        
        return result;
    }
    
    public StringProperty getRoomNum(){
        return rmNum;
    }
    
    public StringProperty getCourseName(){
        return crsName;
    }
    
}

    