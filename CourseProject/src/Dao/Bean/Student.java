package Dao.Bean;

import Dao.Bean.Course;

import java.util.ArrayList;

public class Student {
    private String username;
    private ArrayList<Course> chosen_courses;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Course> getChosen_courses() {
        return chosen_courses;
    }

    public void setChosen_courses(ArrayList<Course> chosen_courses) {
        this.chosen_courses = chosen_courses;
    }
}
