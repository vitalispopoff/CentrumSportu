package com.gym.models.users;

import javax.persistence.*;
import javax.swing.*;
import java.util.Objects;

@Entity
@Table(name="gymuser")
public abstract class User {

    private static int finalUserId = 0;

    @Id
    @Column(name="userid")
    private int userId;

    @Column(name="usertype")
    @Enumerated(EnumType.STRING)
    private UserType userType;

//    @Column(name="firstname")
    private String firstname;

    private String surname;
    private String mail;
    private String login;
    private String password;

    @Column(name="profilepic")
    private Icon profilePic;

    public User() {}

    public User(String login, String password, String firstname, String surname, String mail, Icon profilePic) {
//        finalUserId++;
        this.userId = ++finalUserId;
        this.login = login;
        this.password = password;
        this.firstname = firstname;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    @Override
    public String toString() {
        return "User{ "+
                "usertype="+userType+
                ", id="+
                ", firstname="+firstname+
                ", surname="+surname+
                ", mail="+mail+
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                userType == user.userType &&
                firstname.equals(user.firstname) &&
                surname.equals(user.surname) &&
                mail.equals(user.mail) &&
                login.equals(user.login) &&
                profilePic.equals(user.profilePic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userType, firstname, surname, mail, login, profilePic);
    }
}
