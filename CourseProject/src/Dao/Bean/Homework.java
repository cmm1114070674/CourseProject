package Dao.Bean;

public class Homework {
    private String homeworkname;
    private String question;
    private String answer;
    private String feedback;
    private int score = -1;
    private boolean isDone = false;
    private boolean isCorrected = false;
    private String course_id;
    private String teacher_id;
    private String student_id;

    public Homework(String homeworkname, String question, String answer, String feedback, int score, boolean isDone, boolean isCorrected,
                    String course_id, String teacher_id, String student_id){
        this.homeworkname = homeworkname;
        this.question = question;
        this.answer = answer;
        this.feedback = feedback;
        this.score = score;
        this.isDone = isDone;
        this.isCorrected = isCorrected;
        this.course_id = course_id;
        this.teacher_id = teacher_id;
        this.student_id = student_id;
    }

    public String getHomeworkname(){
        return homeworkname;
    }

    public void setHomeworkname(String homeworkname){
        this.homeworkname = homeworkname;
    }

    public String getQuestion(){
        return question;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer = answer;
    }

    public String getFeedback(){
        return feedback;
    }

    public void setFeedback(String feedback){
        this.feedback = feedback;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }

    public boolean getDone(){
        return isDone;
    }

    public void setDone(boolean isDone){
        this.isDone = isDone;
    }

    public boolean getCorrected(){
        return isCorrected;
    }

    public void setCorrected(boolean isCorrected){
        this.isCorrected = isCorrected;
    }

    public String getCourse_id(){
        return course_id;
    }

    public void setCourse_id(String course_id){
        this.course_id = course_id;
    }

    public String getTeacher_id(){
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id){
        this.teacher_id = teacher_id;
    }

    public String getStudent_id(){
        return student_id;
    }

    public void setStudent_id(String student_id){
        this.student_id = student_id;
    }

}
