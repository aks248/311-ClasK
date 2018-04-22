package models;

import java.io.Serializable;

public class Course implements Serializable {

    String courseName;
    String roomNum;
    String crsPassword;

    public Course(String cName, String rNum, String coursePswd){

        courseName = cName;
        roomNum = rNum;
        crsPassword = coursePswd;

    }

    public boolean authenticate(String course, String room, String password) {
        boolean result = false;
        if((course.equalsIgnoreCase(courseName)) && (room.equals(roomNum)) && (password.equals(crsPassword))){
            result = true;
        }

        return result;
    }
    
    public String getRoomNum(){
        return roomNum;
    }
    
    public String getCourseName(){
        return courseName;
    }
    
    public String getCrsPassword(){
        return crsPassword;
    }

}