package com.gym.utils;

import com.gym.models.users.Admin;
import com.gym.models.users.Client;
import com.gym.models.users.Trainer;
import com.gym.repositories.AdminRepository;
import com.gym.repositories.ClientRepository;
import com.gym.repositories.TrainerRepository;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class Bootstrap {

    private AdminRepository adminRepository;
    private ClientRepository clientRepository;
    private TrainerRepository trainerRepository;

    public Bootstrap(AdminRepository adminRepository, ClientRepository clientRepository, TrainerRepository trainerRepository) {
        this.adminRepository = adminRepository;
        this.clientRepository = clientRepository;
        this.trainerRepository = trainerRepository;
    }

    public void initializeRepository(){
        Admin admin = new Admin("admin","admin1","Jan","Kowalski","admin@gym.pl",new ImageIcon("scieżka"));
        Client client1 = new Client("client","haslo","Zosia","Mikulska","client1@wp.pl",new ImageIcon("scieżka"));
        Client client2 = new Client("client2","haslo2","Ala","Kołymska","client2@wp.pl",new ImageIcon("scieżka"));
        Client client3 = new Client("client3","haslo3","Antoni","Nowak","client3@wp.pl",new ImageIcon("scieżka"));
        Trainer trainer = new Trainer("trainer","pass","trener","trener","trener@gym.pl",new ImageIcon("scieżka"));

        adminRepository.add(admin);
        adminRepository.add(client1);
        adminRepository.add(client2);
        adminRepository.add(client3);
        adminRepository.add(trainer);

        System.out.println(adminRepository.getAllClients().size());

    }

}
