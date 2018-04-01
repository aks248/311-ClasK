/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Instructor extends User{
    
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty userName;
    private StringProperty password;;
    private StringProperty emplNum;
    
    Instructor(String firstName, String lastName, String userName, String password, String emplNum) {
        super(firstName, lastName, userName, password);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.userName = new SimpleStringProperty(userName);
        this.password = new SimpleStringProperty(password);
        this.emplNum = new SimpleStringProperty(emplNum);   
    }
    
    @Override
    boolean authenticate(String uName, String uPassword){
        StringProperty name = new SimpleStringProperty(uName);
        StringProperty pswd = new SimpleStringProperty(uPassword);
        boolean result = false;
        if((name.equals(getUserName())) && (pswd.equals(getPassword()))){
            result = true;
        }
        else;
        
        return result;
    }
    
    public String getInstructorName(){
        String result = (getFirstName() + " " + getLastName());
        return result;
    }

    /**
     * @return the firstName
     */
    @Override
    public String getFirstName() {
        return firstName.get();
    }

    /**
     * @param firstName the firstName to set
     */
    @Override
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    
    @Override
    public StringProperty firstNameProperty(){
        return firstName;
    }

    
    /**
     * @return the lastName
     */
    @Override
    public String getLastName() {
        return lastName.get();
    }

    /**
     * @param lastName the lastName to set
     */
    @Override
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
    
    @Override
    public StringProperty lastNameProperty(){
        return lastName;
    }

    
    /**
     * @return the userName
     */
    @Override
    public String getUserName() {
        return userName.get();
    }

    /**
     * @param userName the userName to set
     */
    @Override
    public void setUserName(String userName) {
        this.userName.set(userName);
    }
    
    @Override
    public StringProperty userNameProperty(){
        return userName;
    }
    
    
    /**
     * @return the password
     */
    
    @Override
    public String getPassword() {
        return password.get();
    }

    /**
     * @param password the password to set
     */
    @Override
    public void password(String password) {
        this.password.set(password);
    }
    
    @Override
    public StringProperty passwordProperty(){
        return password;
    }
    
    /**
     * @return the emplNum
     */
    public String getEmplNum() {
        return emplNum.get();
    }

    /**
     * @param emplNum the emplNum to set
     */
    public void setEmplNum(String emplNum) {
        this.emplNum.set(emplNum);
    }
    
    public StringProperty emplNum(){
        return emplNum;
    }
       
}