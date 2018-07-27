package Dao;

import Dao.Bean.Chapter;
import Dao.Bean.Homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Dao.ConnectDao.getConnected;

public class HomeworkDao {
    public static void homework_insert(Homework homework){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = homework.getHomeworkname();
        String question = homework.getQuestion();
        String answer = homework.getAnswer();
        String feedback = homework.getFeedback();
        int score = homework.getScore();
        int done = -1;
        int corrected = -1;
        if(homework.getDone())
            done = 1;
        else
            done = 0;
        if(homework.getCorrected())
            corrected = 1;
        else
            corrected = -1;
        String teacher_id = homework.getTeacher_id();
        String course_id = homework.getCourse_id();
        String student_id = homework.getStudent_id();
        try {
            connection = getConnected();
            String sql = "INSERT INTO chapter(name, question, answer, feedback, score, isDone, isCorrected, course_id, teacher_id, student_id)"
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, question);
            statement.setString(3, answer);
            statement.setString(4, feedback);
            statement.setString(5, String.valueOf(score));
            statement.setString(6, String.valueOf(done));
            statement.setString(7, String.valueOf(corrected));
            statement.setString(8, course_id);
            statement.setString(9, teacher_id);
            statement.setString(10, student_id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void homework_delete(Homework homework){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = homework.getHomeworkname();
        String teacher_id = homework.getTeacher_id();
        String course_id = homework.getCourse_id();
        try {
            connection = getConnected();
            String sql = "DELETE FROM course WHERE name = ? AND course_id = ? AND teacher_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, course_id);
            statement.setString(3, teacher_id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
