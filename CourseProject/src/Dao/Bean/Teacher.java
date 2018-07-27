package Dao.Bean;

import java.util.ArrayList;

public class Teacher {
    private String teachername;
    private ArrayList<Course> open_courses;

    public Teacher(String teachername, ArrayList<Course> open_courses){
        this.teachername = teachername;
        this.open_courses = open_courses;
    }

    public String getTeachername(){
        return this.teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public ArrayList<Course> getOpen_courses() {
        return open_courses;
    }

    public void setOpen_courses(ArrayList<Course> open_courses) {
        this.open_courses = open_courses;
    }
}
