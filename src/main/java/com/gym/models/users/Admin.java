package com.gym.models.users;

import javax.swing.*;

public class Admin extends User {

    public Admin(String login, String password, String name, String surname, String mail, Icon profilePic) {
        super(login, password, name, surname, mail, profilePic);
        setUserType(UserType.ADMIN);

    }
}
