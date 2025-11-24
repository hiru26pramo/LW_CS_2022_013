package LW_08;

import javax.swing.*;
import java.sql.*;

public class DBConnector {
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/myDatabase";
    private String uName = "root";
    private String password = "";
    private PreparedStatement preparedStatement;

    public DBConnector() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(url,uName,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //method to add data to database
    void addData(String name, String email,String gender, String birthday,String password) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO `users` (`Name`, `Email`, `Gender`, `Birthday`, `Password`) VALUES (?, ?, ?, ?, ?)");
        preparedStatement.setString(1,name);
        preparedStatement.setString(2,email);
        preparedStatement.setString(3,gender);
        preparedStatement.setString(4,birthday);
        preparedStatement.setString(5,password);
        preparedStatement.execute();

    }

    //method to verify data to database
    boolean getData (String email,String password) throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT email, password FROM users WHERE email = ? and password = ?");
        preparedStatement.setString(1,email);
        preparedStatement.setString(2,password);
        ResultSet rs = preparedStatement.executeQuery();
        return rs.next();
    }


}
