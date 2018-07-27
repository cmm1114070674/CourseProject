package Service.Utils;

import Dao.Bean.Course;

import java.util.ArrayList;

public class SearchUtil {
    private static ArrayList<Course> coursesAll = new ArrayList<>();

    public static ArrayList<Course> searchCourseName(String word){
        ArrayList<Course> courses = new ArrayList<>();
        for(Course i:coursesAll){
            if(i.getCoursename().contains(word))
                courses.add(new Course(i.getStudents(), i.getTeacher(), i.getCoursename(), i.getCoursecontent(), i.getChapters(), i.getHomeworks()));
        }
        return courses;
    }

    public static ArrayList<Course> searchCourseTeacher(String word){
        ArrayList<Course> courses = new ArrayList<>();
        for(Course i:coursesAll){
            if(i.getTeacher().getTeachername().contains(word))
                courses.add(new Course(i.getStudents(), i.getTeacher(), i.getCoursename(), i.getCoursecontent(), i.getChapters(), i.getHomeworks()));
        }
        return courses;
    }

    public static ArrayList<Course> searchCourseContent(String word){
        ArrayList<Course> courses = new ArrayList<>();
        for(Course i:coursesAll){
            if(i.getCoursecontent().contains(word))
                courses.add(new Course(i.getStudents(), i.getTeacher(), i.getCoursename(), i.getCoursecontent(), i.getChapters(), i.getHomeworks()));
        }
        return courses;
    }

}
