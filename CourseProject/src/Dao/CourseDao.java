package Dao;

import Dao.Bean.Course;
import Dao.Bean.Student;
import Dao.Bean.Teacher;

import java.sql.*;

import static Dao.ConnectDao.getConnected;
import static java.sql.DriverManager.getConnection;

public class CourseDao {
    public static void course_insert(Course course){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = course.getCoursename();
        String teacher = course.getTeacher().getTeachername();
        String course_content = course.getCoursecontent();
        try {
            connection = getConnected();
            String sql = "INSERT INTO course(name, teacher, content) VALUES(?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, teacher);
            statement.setString(3, course_content);
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

    public static void course_delete(Course course){
        Connection connection = null;
        PreparedStatement statement = null;
        String name = course.getCoursename();
        String teacher = course.getTeacher().getTeachername();
        try {
            connection = getConnected();
            String sql = "DELETE FROM course WHERE name = ? AND teacher = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, teacher);
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

    public static void main(String[] argv){
        Teacher teacher = new Teacher("h", null);
        Course course = new Course(null, teacher, "a", "b", null, null);
        course_delete(course);
    }




}
