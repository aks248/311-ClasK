/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

public class Course {
    
    String crsName;
    String rmNum;
    String crsPassword;
    
    Course(String cName, String rNum, String coursePswd){
        
        crsName = cName;
        rmNum = rNum;
        crsPassword = coursePswd;
    
    }
    
    boolean authenticate(String roomNum, String crsPswd){
        String room = roomNum;
        String password = crsPswd;
        
        boolean result = false;
        if((room.equals(rmNum)) && (password.equals(crsPassword))){
            result = true;
        }
        else;
        
        return result;
    }
    
    public String getRoomNum(){
        return rmNum;
    }
    
}

    