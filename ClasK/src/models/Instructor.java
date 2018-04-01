package models;

public class Instructor extends User
{

    private String fName;
    private String lName;
    private String usrName;
    private String passwrd;
    private String emplNumber;

    Instructor(String first, String last, String user, String pass, String empNum)
    {
        super(first, last, user, pass);
        fName = first;
        lName = last;
        usrName = user;
        passwrd = pass;
        emplNumber = empNum;
    }

    @Override
    boolean authenticate(String uName, String uPassword)
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

    public String getInstructorName()
    {
        String result = (fName + " " + lName);
        return result;
    }

}
