package main;

class NavModel {
    
    private Student[] students;
    private Instructor[] instructors;
    private Course[] courses;
    String userType;
    String currentUser;
    String currentInstructor;
    String roomNumber;
            

    NavModel() {
        students = new Student[] { //Manual student registration; testing purposes
            new Student("Adam", "Smith", "as001", "pass", "0001"),
            new Student("Ian", "Roach","ir002", "pass2", "0002"),
            new Student("Jeffrey", "Rowe", "jmr202", "pass3", "0003")
        };
         
        instructors = new Instructor[] {//Manual instructor registartion; testing purposes
            new Instructor("Richard", "Lomotey", "rkl5137", "pass4", "5137")
        };
         
        courses = new Course[] {
            new Course("IST 311", "3", "room3")
        };
    }
         
        //TODO arbitrary student registration code
    
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
    /**
     * @return the array of students
     */
    public Instructor[] getInstructors() {
        return instructors;
    }
    
    /**
     * @param i instructor index number
     * @return instructor of index i
     */
    public Instructor getInstructorById(int i) {
        return instructors[i];
    }
    
    /**
     * @return the array of courses
     */
    public Course[] getCourses() {
        return courses;
    }
    
    /**
     * @param i course index number
     * @return course of index i
     */
    public Course getCourseById(int i) {
        return courses[i];
    }
    
    
}
