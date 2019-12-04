package com.gym.models.users;

import javax.swing.*;

public abstract class User {

   private String login;
   private String password;
   private String name;
   private  String surname;
   private  String mail;
   private int userId;
   private static int finalUserId=0;
   private UserType userType;
   private Icon profilePic;

    public User(String login, String password, String name, String surname, String mail, Icon profilePic) {
        finalUserId++;
        this.userId = finalUserId;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.profilePic = profilePic;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
/*
    public String getPassword() {
        return password;
    }*/

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Icon getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(Icon profilePic) {
        this.profilePic = profilePic;
    }
}
