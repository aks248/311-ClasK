package models;

import java.util.HashMap;
import java.io.Serializable;

public class UserDatabase {
    private static HashMap<String, String> credentials_table = new HashMap<>();
    private static HashMap<String, String> account_table = new HashMap<>();

    public static void init() {
        loadDB();
    }

    public static void loadDB() {
        credentials_table.put("test", "pass");
        credentials_table.put("student1", "abc");

        account_table.put("test", "instructor");
        account_table.put("student1", "student");
    }

    public static void addAccount(String first, String last, String username, String pass, String account_type) {
        if (!credentials_table.containsKey(username)) {
            credentials_table.put(username, pass);
            account_table.put(username, account_type);
        }
    }

    public static String getAccountType(String user) {
        if (!credentials_table.containsKey(user)) {
            return null;
        } else {
            return account_table.get(user);
        }
    }

    public static boolean containsUser(String user) {
        if (!credentials_table.containsKey(user)) {
            return false;
        }
        return true;
    }

    public static boolean authenticatePassword(String user, String pass) {
        if (!credentials_table.containsKey(user)) {
            return false;
        }
        else if (!credentials_table.get(user).equals(pass)) {
            return false;
        }
        return true;
    }
}
