package com.lol.database;

/**
 * Created by Денис on 28.10.2016.
 */
public class User {



    private int id;
    private String name;
    private String login;
    private String password;

    public User(){}

    public User(String login, String password){
        this.login = login;
        this.password = password;
    }

    public User(int id, String name, String login, String password){
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + "{id: " + id + ", name " + name + ", login " + login + ", password " + password + "}";
    }
}
