package Dao;

import Dao.Bean.Student;

import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String CONNECTION = "jdbc:mysql://localhost/courseproject";
    private static final String USER = "root";
    private static final String PASSWORD = "cmm123";

    public static void test(){
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("No Driver");
            e.printStackTrace();
        }
        java.sql.Connection connection = null;
        try{
            connection = DriverManager.getConnection(CONNECTION, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("No connection");
            e.printStackTrace();
        }
    }

    public static void Student_create(){

    }

    public static void Student_insert(Student student){

    }




}
