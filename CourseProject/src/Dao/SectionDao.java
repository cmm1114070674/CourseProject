package Dao;

import Dao.Bean.Chapter;
import Dao.Bean.Section;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static Dao.ConnectDao.getConnected;

public class SectionDao {
    public static void section_insert(Section section){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = section.getSectionname();
        String content = section.getContent();
        String teacher_id = section.getTeacher_id();
        String course_id = section.getCourse_id();
        String chapter_id = section.getChapter_id();
        try {
            connection = getConnected();
            String sql = "INSERT INTO chapter(name, content, chapter_id, course_id, teacher_id) VALUES(?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, content);
            statement.setString(3, chapter_id);
            statement.setString(4, course_id);
            statement.setString(5, teacher_id);
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

    public static void section_delete(Section section){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = section.getSectionname();
        String chapter_id = section.getChapter_id();
        String teacher_id = section.getTeacher_id();
        String course_id = section.getCourse_id();
        try {
            connection = getConnected();
            String sql = "DELETE FROM course WHERE name = ? AND chapter_id = ? AND course_id = ? AND teacher_id = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, chapter_id);
            statement.setString(3, course_id);
            statement.setString(4, teacher_id);
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
