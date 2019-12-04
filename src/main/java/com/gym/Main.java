package com.gym;

import com.gym.models.users.Admin;
import com.gym.models.users.Client;
import com.gym.models.users.UserType;
import com.gym.models.workout.Pass;
import com.gym.utils.Bootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.swing.*;

@SpringBootApplication
public class Main {

    private Bootstrap bootstrap;

    public Main(Bootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }

    @PostConstruct
public void init(){
        bootstrap.initializeRepository();
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);



    }
}
