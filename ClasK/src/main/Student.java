package main;

//@author Zach Ressler

public class Student extends User {
    
    public Student(String studentName, String password) {
        super(studentName, password, "Not Defined");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}