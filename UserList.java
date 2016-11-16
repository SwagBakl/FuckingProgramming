package com.lol.database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Денис on 29.10.2016.
 */
public class UserList {
    DBWorker dbWorker = new DBWorker();
    public List<User> getAllUser(){

        String query = "select * from users";

        List<User>users = new ArrayList<User>();
        User user = null;
        try {
            Statement statement = dbWorker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next())
            {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
                users.add(user);

            }
            resultSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    /*public List<User> Authorisation(){
        User user = dbWorker.
    }*/
}
