package Dao.Bean;

import java.util.ArrayList;

public class Section {
    private String sectionname;
    private String content;
    private String chapter_id;
    private String course_id;
    private String teacher_id;

    public Section(String sectionname, String content, String chapter_id, String course_id, String teacher_id){
        this.sectionname = sectionname;
        this.content = content;
        this.chapter_id = chapter_id;
        this.course_id = course_id;
        this.teacher_id = teacher_id;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(String chapter_id) {
        this.chapter_id = chapter_id;
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
