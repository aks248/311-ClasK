package models;

import java.util.ArrayList;
import java.io.Serializable;

public class CourseDatabase {
    private static ArrayList<Course> course_list = new ArrayList<>();

    public static void init() {
        loadDB();
    }

    public static void loadDB() {
        course_list.add(new Course("IST311", 1, "pass"));
        course_list.add(new Course("IST331", 2, ""));
    }

    public static boolean containsCourse(String courseName) {
        for (Course course : course_list) {
            if (courseName.toLowerCase().equals(course.crsName.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static void addCourse(String courseName, int roomNumber, String pass) {
        if (!course_list.contains(courseName)) {
            course_list.add(new Course(courseName, roomNumber, pass));
        }
    }

    public static Course getCourse(String courseName) {
        if (!course_list.contains(new Course(courseName, 0, ""))) {
            return null;
        } else {
            return course_list.get(course_list.indexOf(new Course(courseName, 0 , "")));
        }
    }

    public static boolean authenticatePassword(String courseName, String pass) {
        if (!course_list.contains(new Course(courseName, 0, ""))) {
            return false;
        }
        else if (!course_list.get(course_list.indexOf(new Course(courseName, 0 , ""))).crsPassword.equals(pass)) {
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> getRoomNumbers() {
        ArrayList<Integer> room_numbers = new ArrayList<>();
        for (Course course : course_list) {
            int roomNum = course.rmNum;
            room_numbers.add(roomNum);
        }
        return room_numbers;
    }

    public static ArrayList<Integer> getAvailableRooms() {
        ArrayList<Integer> available_rooms = new ArrayList<>();
        ArrayList<Integer> taken_rooms = getRoomNumbers();
        for (int i = 1; i <= 10; i++) {
            if (taken_rooms.contains(i)) {
                continue;
            }
            available_rooms.add(i);
        }
        return available_rooms;
    }
}
