package com.lol.database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Денис on 28.10.2016.
 */
public class Login_Window extends JPanel {

    /*public static final String FIND_BY_LOGIN_AND_PASSWORD = "select * from users where login = ? and password = ?";

    private static final String URL = "jdbc:mysql://localhost:3306/bank_roll";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection = null;
    PreparedStatement PST = null;
    public Login_Window(){
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
    }*/


    public void Start_Login_Window(){


        final DBWorker dbWorker = new DBWorker();


        final JFrame jf = new JFrame("Login");
        jf.add(new Login_Window());
        jf.setSize(300, 200);

        JLabel loginLabel = new JLabel("Login: ");
        final JTextField loginField = new JTextField(10);
        final String login = loginField.getText();
        JLabel passLabel = new JLabel("Password: ");
        final JTextField passField = new JTextField(10);
        final String password = passField.getText();
        final JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");
        final JLabel error_1_Label = new JLabel("Incorrect login or password");
        error_1_Label.setVisible(false);


        jf.setLayout(null);
        loginLabel.setBounds(80, 40, 40, 20);
        loginField.setBounds(150, 40, 90, 20);
        passLabel.setBounds(80, 60, 65, 20);
        passField.setBounds(150, 60, 90, 20);
        loginButton.setBounds(80, 90, 70, 30);
        cancelButton.setBounds(159, 90, 80, 30);
        error_1_Label.setBounds(81, 110, 190, 40);


        error_1_Label.setForeground(Color.RED);



        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {



            /*
            try {
                PST = connection.prepareStatement(FIND_BY_LOGIN_AND_PASSWORD);
                PST.setString(1,loginField.getText());
                PST.setString(2, passField.getText());
                ResultSet resultSet = PST.executeQuery();
                if (resultSet.next()) {
                MainWindow mw = new MainWindow();
                    mw.Main_Window_Start();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Login and password is incorrect");
                }
                resultSet.close();
                PST.close();
                connection.close();
            }
                catch (Exception p)
                {
                    JOptionPane.showMessageDialog(null, p);
                }*/

            User user = dbWorker.chechUser(login, password);

                if(user != null)
                {
                    System.out.print("Whaaaaat");
                }
                else
                {
                    System.out.print("Fuck:(");
                }
            }
        });


        jf.add(loginLabel);
        jf.add(loginField);
        jf.add(passLabel);
        jf.add(passField);
        jf.add(loginButton);
        jf.add(cancelButton);
        jf.add(error_1_Label);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
