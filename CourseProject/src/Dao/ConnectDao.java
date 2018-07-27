package Dao;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;

public class ConnectDao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String CONNECTION = "jdbc:mysql://localhost/courseproject";
    private static final String USER = "root";
    private static final String PASSWORD = "cmm123";

    public static Connection getConnected(){
        try{
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("No Driver");
            e.printStackTrace();
        }
        Connection connection = null;
        try{
            connection = getConnection(CONNECTION, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("No connection");
            e.printStackTrace();
        }
        return connection;
    }
}
