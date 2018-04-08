
package clask;

public class Instructor extends User{
    
    String fName;
    String lName;
    String usrName;
    String passwrd;
    String emplNumber;
    
    Instructor(String first, String last, String user, String pass, String empNum) {
        super(first, last, user, pass);
        fName = first;
        lName = last;
        usrName = user;
        passwrd = pass;
        emplNumber = empNum;   
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
    
    public String getInstructorName(){
        String result = (fName + " " + lName);
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
       
}