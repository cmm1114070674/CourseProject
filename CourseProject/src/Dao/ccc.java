package Dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ccc {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String CONNECTION = "jdbc:mysql://localhost/courseproject";
    private static final String USER = "root";
    private static final String PASSWORD = "cmm123";

    public static void test(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
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

    public static void insert() {
        java.sql.Connection connection = null;
        Statement statement = null;
        String insertTableSQL = "INSERT INTO student" + "(name, sex, birthday, location)" + "VALUES" + "('aaaa', 'female' , '1998-01-01', 'shanghai')";
        try {
            connection = DriverManager.getConnection(CONNECTION, USER, PASSWORD);
            statement = connection.createStatement();
            System.out.println(insertTableSQL);
            statement.executeUpdate(insertTableSQL);
            System.out.println("Insert Well!");
        } catch (SQLException e) {
            System.out.println("Insert False");
            e.printStackTrace();
        } finally {
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

    public static void delete(){
        java.sql.Connection connection = null;
        Statement statement = null;
        String deleteTableSQL = "DELETE FROM student WHERE name = 'aaaa'";
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "cmm123");
            statement = connection.createStatement();
            System.out.println(deleteTableSQL);
            statement.executeUpdate(deleteTableSQL);
            System.out.println("Delete Well!");
        } catch (SQLException e) {
            System.out.println("Delete False");
            e.printStackTrace();
        }
        finally {
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

    public static void revise() {
        java.sql.Connection connection = null;
        Statement statement = null;
        String insertTableSQL = "update student set sex = 'male' where name = 'aaaa'";
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "cmm123");
            statement = connection.createStatement();
            System.out.println(insertTableSQL);
            statement.executeUpdate(insertTableSQL);
            System.out.println("Change Well!");
        } catch (SQLException e) {
            System.out.println("Change False");
            e.printStackTrace();
        } finally {
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

    public static void select(){
        java.sql.Connection connection = null;
        Statement statement = null;
        String selectTableSQL = "SELECT name, sex, birthday, location FROM student";
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "cmm123");
            statement = connection.createStatement();
            System.out.println(selectTableSQL);
            ResultSet rs = statement.executeQuery(selectTableSQL);
            while(rs.next()){
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                String birthday = rs.getString("birthday");
                String location = rs.getString("location");
                System.out.println("name: " + name);
                System.out.println("sex: " + sex);
                System.out.println("birthday: " + birthday);
                System.out.println("location: " + location);
            }
            System.out.println("Select Well!");
        } catch (SQLException e) {
            System.out.println("Select False");
            e.printStackTrace();
        }
        finally {
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
