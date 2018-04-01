/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.StringProperty;

public class NavModel {
    
    private Student[] students;
    private Instructor[] instructors;
    private Course[] courses;
            

    String userType;
    String currentUser;
    String currentInstructor;
    String roomNumber;
    String currentCourse;
            

    NavModel() {
        
    }

    public void createStudents(){
        students = new Student[] { //Manual student registration; testing purposes
            new Student("Adam", "Smith", "as001", "pass", "0001"),
            new Student("Ian", "Roach","ir002", "pass2", "0002"),
            new Student("Jeffrey", "Rowe", "jmr202", "pass3", "0003")
        };
    }
    
    public void createInstructors(){
        instructors = new Instructor[] {//Manual instructor registartion; testing purposes
            new Instructor("Richard", "Lomotey", "rkl5137", "pass4", "5137")
        };
    }
    
    public void createCourse(){
        courses = new Course[] {
            new Course("IST 311", "3", "room3")
        };   
    }
}