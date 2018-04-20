package controllers;

import clask.ClaskApp;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import models.Instructor;
import models.Student;

public class SerializedCollection {
    private static ClaskApp mainInstance;
    private static SerializedCollection instance;
    
    
    final String listOfUsersFileName = "listOfUsers.ser";
    
    public SerializedCollection(){
        mainInstance = ClaskApp.getInstance();
        instance = this;
        this.readUserListFile();
        if(mainInstance.getListOfStudents().isEmpty() || mainInstance.getListOfStudents() == null){
            this.createUserList();
            this.writeUserListFile();
            this.readUserListFile();
        }
        
        this.printUserList();
    }
    
    public void readUserListFile(){
    FileInputStream fis = null;
    ObjectInputStream in = null;
    try {
        fis = new FileInputStream(listOfUsersFileName);
        in = new ObjectInputStream(fis);
        mainInstance.setListOfStudents((ArrayList<Student>)in.readObject());
        mainInstance.setListOfInstructors((ArrayList<Instructor>)in.readObject());
        in.close();
        if(!mainInstance.getListOfStudents().isEmpty()){
             System.out.println("There are users in the user list");
        }
    }
    catch(IOException | ClassNotFoundException ex) {
    }
}
    
    public void writeUserListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(listOfUsersFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(mainInstance.getListOfStudents());
            out.writeObject(mainInstance.getListOfInstructors());
            out.close();
        }
        catch(IOException ex) {
        }
    }
    
    public void createUserList() {
        //Manual student registration
        mainInstance.getListOfStudents().add(new Student("Adam", "Smith", "as001", "pass", "0001"));
        mainInstance.getListOfStudents().add(new Student("Ian", "Roach","ir002", "pass2", "0002"));
        mainInstance.getListOfStudents().add(new Student("Jeffrey", "Rowe", "jmr202", "pass3", "0003"));
        
        //Manual instructor registration
        mainInstance.getListOfInstructors().add(new Instructor("Richard", "Lomotey", "rkl5137", "pass4", "5137"));
        

        System.out.println("UserList created");
        System.out.println("The UserList is: ");
    }
    
    public void printUserList(){
        System.out.println("The Student list has these users:");
        for(int i = 0; i < mainInstance.getListOfStudents().size(); i++){
            Student curStudent = (Student) mainInstance.getListOfStudents().get(i);
            System.out.println(curStudent.getStudentName());
        }
    
        System.out.println("The Instructor list has these users:");
        for(int i = 0; i < mainInstance.getListOfInstructors().size(); i++){
            Instructor curInstructor = (Instructor) mainInstance.getListOfInstructors().get(i);
            System.out.println(curInstructor.getInstructorName());
        }
    }
    
    public void addToListOfStudents(String fName, String lName, String Username, String Password, String blank){
        mainInstance.getListOfStudents().add(new Student(fName, lName, Username, Password, blank));
        System.out.println("Testing");
        for(int i = 0; i < mainInstance.getListOfStudents().size(); i++){
            Student curStudent = (Student) mainInstance.getListOfStudents().get(i);
            System.out.println(curStudent.getStudentName());
            writeUserListFile();
        }
    }
    
    public void addToListOfInstructors(String fName, String lName, String Username, String Password, String blank){
        mainInstance.getListOfInstructors().add(new Instructor(fName, lName, Username, Password, blank));
        System.out.println("Testing");
        for(int i = 0; i < mainInstance.getListOfInstructors().size(); i++){
            Instructor curInstructor = (Instructor) mainInstance.getListOfInstructors().get(i);
            System.out.println(curInstructor.getInstructorName());
            writeUserListFile();
        }
    }

    
    public static SerializedCollection getInstance(){
        return instance;
    }
     
}
