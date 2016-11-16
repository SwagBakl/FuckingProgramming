package com.lol.database;

/**
 * Created by Денис on 25.10.2016.
 */
public class Main {
    

    public static void main(String[] args){

       Login_Window lw = new Login_Window();
       lw.Start_Login_Window();


       /*DBWorker worker = new DBWorker();

        String query = "select * from users  where login = 'swag' and password = 'bakl'";
        PreparedStatement statement = null;
        //User user = null;

        try {
            statement = worker.getConnection().prepareStatement(query);
            ResultSet resultSet =statement.executeQuery();

            while (resultSet.next())
            {
                User user = new User();
                user.setId(resultSet.getInt(1));
                user.setName(resultSet.getString(2));
                user.setLogin(resultSet.getString(3));
                user.setPassword(resultSet.getString(4));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }*/





    }
}
