package Dao.Bean;

import Dao.Bean.Section;

import java.util.ArrayList;

public class Chapter {
    private String chaptername;
    private ArrayList<Section> sections;
    private String course_id;
    private String teacher_id;

    public Chapter(String chaptername, ArrayList<Section> sections, String course_id, String teacher_id){
        this.chaptername = chaptername;
        this.sections = sections;
        this.course_id = course_id;
        this.teacher_id = teacher_id;
    }

    public String getChaptername() {
        return chaptername;
    }

    public void setChaptername(String chaptername) {
        this.chaptername = chaptername;
    }

    public ArrayList<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

}
