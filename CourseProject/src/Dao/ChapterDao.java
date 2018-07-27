package Dao;

import Dao.Bean.Chapter;
import Dao.Bean.Course;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Dao.ConnectDao.getConnected;

public class ChapterDao {
    public static void chapter_insert(Chapter chapter){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = chapter.getChaptername();
        String teacher_id = chapter.getTeacher_id();
        String course_id = chapter.getCourse_id();
        try {
            connection = getConnected();
            String sql = "INSERT INTO chapter(name, course_id, teacher_id) VALUES(?, ?, ?)";
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

    public static void chapter_delete(Chapter chapter){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = chapter.getChaptername();
        String teacher_id = chapter.getTeacher_id();
        String course_id = chapter.getCourse_id();
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
