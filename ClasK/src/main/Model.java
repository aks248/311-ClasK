package main;

/**
 *
 * @author Adam
 */

public class Model {
    
    private Student[] students;
    
    public Model() {
        students = new Student[] {
            new Student("Adam Smith", "pass"),
            new Student("Ian Roach", "pass2")
        };
    }
    
    public Student[] getStudents() {
        return students;
    }
    
    public Student getStudentById(int i) {
        return students[i];
    }
}
