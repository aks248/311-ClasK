package dataobjects;

abstract class User
{

    String firstName;
    String lastName;
    String userName;
    String password;

    User(String fName, String lName, String uName, String pswd)
    {
        firstName = fName;
        lastName = lName;
        userName = uName;
        password = pswd;

    }

    abstract boolean authenticate(String name, String password);

}