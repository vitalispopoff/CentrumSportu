package com.gym.models.users;

import javax.swing.*;

public class Client extends User {

    boolean gymPassStatus;

    public Client(String login, String password, String name, String surname, String mail,Icon profilePic) {
        super(login, password, name, surname, mail, profilePic);
        setUserType(UserType.CLIENT);

    }



}
