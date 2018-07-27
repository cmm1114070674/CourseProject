package Dao.Bean;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> students;
    private Teacher teacher;
    private String coursename;
    private String coursecontent;
    private ArrayList<Chapter> chapters;
    private ArrayList<Homework> homeworks;

    public Course(ArrayList<Student> students, Teacher teacher, String coursename, String coursecontent,
                  ArrayList<Chapter> chapters, ArrayList<Homework> homeworks){
        this.students = students;
        this.teacher = teacher;
        this.coursename = coursename;
        this.coursecontent = coursecontent;
        this.chapters = chapters;
        this.homeworks = homeworks;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public String getCoursename(){
        return this.coursename;
    }

    public void setCoursename(String coursename){
        this.coursename = coursename;
    }

    public String getCoursecontent(){
        return this.coursecontent;
    }

    public void setCoursecontent(String coursecontent){
        this.coursecontent = coursecontent;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters){
        this.chapters = chapters;
    }

    public ArrayList<Homework> getHomeworks() {
        return homeworks;
    }

    public void setHomeworks(ArrayList<Homework> homeworks){
        this.homeworks = homeworks;
    }


}
