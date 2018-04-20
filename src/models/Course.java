package models;

import java.io.Serializable;

public class Course implements Serializable {

    String crsName;
    int rmNum;
    String crsPassword;

    public Course(String cName, int rNum, String coursePswd){

        crsName = cName;
        rmNum = rNum;
        crsPassword = coursePswd;

    }

    boolean authenticate(int roomNum, String crsPswd) {
        boolean result = false;
        if((roomNum == rmNum) && (crsPswd.equals(crsPassword))){
            result = true;
        }

        return result;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        Course object = (Course) o;
        if (crsName.toLowerCase().equals(object.crsName.toLowerCase())) {
            return true;
        }
        return false;
    }

    public int getRoomNum(){
        return rmNum;
    }

}