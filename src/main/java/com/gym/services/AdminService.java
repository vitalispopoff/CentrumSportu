package com.gym.services;

import com.gym.models.users.Admin;
import com.gym.models.users.Client;
import com.gym.models.users.Trainer;
import com.gym.repositories.AdminRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public Admin createAdmin(Admin admin){
        return adminRepository.add(admin);
    }

    public Client createClient(Client client){
        return adminRepository.add(client);
    }

    public Trainer createTrainer(Trainer trainer){
        return adminRepository.add(trainer);
    }

    public List<Client> getAllClients(){
        return adminRepository.getAllClients();
    }
}
