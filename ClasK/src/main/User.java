package main;

/**
 *
 * @author Adam
 */
public abstract class User {
    protected String name;
    protected String password;
    protected String course;
    
    /**
     * @param name the first and last name of the user, or an alias
     * @param password the user's password
     * @param course the user's course ID
     */
    public User(String name, String password, String course) {
        this.name = name;
        this.password = password;
        this.course = course;
    }
}
