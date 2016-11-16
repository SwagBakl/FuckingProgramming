package com.lol.database;


import javax.swing.*;
import java.sql.*;

/**
 * Created by Денис on 28.10.2016.
 */
public class DBWorker {


    public static final String FIND_BY_LOGIN_AND_PASSWORD = "select * from users where login = ? and password = ?";

    private static final String URL = "jdbc:mysql://localhost:3306/bank_roll";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    private Connection connection = null;
    PreparedStatement PST = null;
    User user = null;



    public DBWorker(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (SQLException e )
        {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public User chechUser(String login, String password){



        try {
        PST = connection.prepareStatement(FIND_BY_LOGIN_AND_PASSWORD);
            PST.setString(1, login);
            PST.setString(2, password);
            ResultSet resultSet = PST.executeQuery();
            if(resultSet.next())
            {
                MainWindow.Main_Window_Start();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "SOMETHING INCORRECT!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
