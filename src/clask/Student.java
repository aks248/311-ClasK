package clask;

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
        if((name.equalsIgnoreCase(usrName)) && (password.equals(passwrd))){
            result = true;
        }
        else;
        
        return result;
    }
    
    @Override
    public String getFirstName(){
        String result = (fName);
        return result;
    }
    
    @Override
    public String getLastName(){
        String result = (lName);
        return result;
    }
    
    public String getStudentName(){
        String result = (fName + " " + lName);
        return result;
    }
    
}