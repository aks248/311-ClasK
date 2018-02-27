package main;

/**
 *
 * @author Adam
 */

public class Model {
    
    private Student[] students;
    
    public Model() { 
        students = new Student[] { //Manual student registration; testing purposes
            new Student("Adam Smith", "pass"),
            new Student("Ian Roach", "pass2")
        };
        //TODO arbitrary student registration code
    }
    
    /**
     * @return the array of students
     */
    public Student[] getStudents() {
        return students;
    }
    
    /**
     * @param i student index number
     * @return student of index i
     */
    public Student getStudentById(int i) {
        return students[i];
    }
}
