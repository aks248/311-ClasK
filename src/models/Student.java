package models;

import java.io.Serializable;

public class Student extends User implements Serializable {

    private String fName;
    private String lName;
    private String usrName;
    private String passwrd;
    private String studentNumber;

    public Student(String first, String last, String user, String pass, String studentNum)
    {
        super(first, last, user, pass);
        fName = first;
        lName = last;
        usrName = user;
        passwrd = pass;
        studentNumber = studentNum;
    }

    @Override
    public boolean authenticate(String uName, String uPassword)
    {
        String name = uName;
        String password = uPassword;
        boolean result = false;
        if((name.equals(usrName)) && (password.equals(passwrd)))
        {
            result = true;
        }
        else;

        return result;
    }
    public String getStudentFirstName(){
        return fName;
    }

    public String getStudentName()
    {
        return (fName + " " + lName);
    }
    
    public String getStudentUsername() {
        return usrName;
    }
}