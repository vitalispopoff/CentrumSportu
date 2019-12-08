package com.gym.models.users;

enum UserType{
    ADMIN,
    TRAINER,
    CLIENT

/*
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class UserType {

    static {
        String[] typeList = {"ADMIN", "CLIENT", "TRAINER"};
        for (String type : typeList)
            new UserType(type);
    }

    @Id
    @GeneratedValue
    @Column(name = "usertypeid")
    private int userTypeId;

    @Column(name = "usertypename")
    private String name;

    public UserType() {
    }

    public UserType(String name) {
        this.name = name;
    }*/
}
