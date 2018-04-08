/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clask;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;


abstract class User {
    
    private StringProperty firstName;
    private StringProperty lastName;
    private StringProperty userName;
    private StringProperty password;
    
    User(String firstName, String lastName, String userName, String password){
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.userName = new SimpleStringProperty(userName);
        this.password = new SimpleStringProperty(password);
        
    }
    
    abstract boolean authenticate(String name, String password);

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName.get();
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }
    
    public StringProperty firstNameProperty(){
        return firstName;
    }

    
    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName.get();
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
    
    public StringProperty lastNameProperty(){
        return lastName;
    }

    
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName.get();
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName.set(userName);
    }
    
    public StringProperty userNameProperty(){
        return userName;
    }
    
    
    /**
     * @return the password
     */
    
    public String getPassword() {
        return password.get();
    }

    /**
     * @param password the password to set
     */
    public void password(String password) {
        this.password.set(password);
    }
    
    public StringProperty passwordProperty(){
        return password;
    }
      
}