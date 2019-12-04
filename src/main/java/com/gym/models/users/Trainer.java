package com.gym.models.users;

import javax.swing.*;

public class Trainer extends User {

    public Trainer(String login, String password, String name, String surname, String mail, Icon profilePic) {
        super(login, password, name, surname, mail, profilePic);
        setUserType(UserType.TRAINER);
    }


}
