package main;

/**
 *
 * @author Adam
 */
public abstract class User {
    protected String name;
    protected String password;
    protected String course;
    
    public User(String name, String password, String course) {
        this.name = name;
        this.password = password;
        this.course = course;
    }
}
