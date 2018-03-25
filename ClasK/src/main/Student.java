package main;

//@author Zach Ressler

public class Student extends User {
    
    String fName;
    String lName;
    String usrName;
    String passwrd;
    String studentNumber;
    
    Student(String first, String last, String user, String pass, String studentNum) {
        super(first, last, user, pass);
        fName = first;
        lName = last;
        usrName = user;
        passwrd = pass;
        studentNumber = studentNum;   
    }
    
    @Override
    boolean authenticate(String uName, String uPassword){
        String name = uName;
        String password = uPassword;
        boolean result = false;
        if((name.equals(usrName)) && (password.equals(passwrd))){
            result = true;
        }
        else;
        
        return result;
    }
    
    public String getStudentName(){
        String result = (fName + " " + lName);
        return result;
    }
}