package com.gym.repositories;

import com.gym.models.users.Admin;
import com.gym.models.users.Client;
import com.gym.models.users.Trainer;
import org.springframework.stereotype.Repository;

import static com.gym.repositories.ClientRepository.clientsList;
import static com.gym.repositories.TrainerRepository.trainersList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AdminRepository {

    final protected Map<Integer, Admin> adminsList = new HashMap<>();

    public List<Admin> getAllAdmins(){
        List<Admin> list = new ArrayList<>();
        adminsList.forEach((integer, model) -> list.add(model));
        return list;
    }

    public List<Client> getAllClients(){
        List<Client> list = new ArrayList<>();
        clientsList.forEach((integer, model) -> list.add(model));
        return list;
    }

    public List<Trainer> getAllTrainers(){
        List<Trainer> list = new ArrayList<>();
        trainersList.forEach((integer, model) -> list.add(model));
        return list;
    }

    public Client add(Client addClient){
        if (clientsList.containsKey(addClient.getUserId()))
            throw new IllegalArgumentException("Object id: " + addClient.getUserId() + " exist in repository");

        clientsList.put(addClient.getUserId(),addClient);
        return addClient;
    }

    public Trainer add(Trainer trainer){
        if (trainersList.containsKey(trainer.getUserId()))
            throw new IllegalArgumentException("Object id: " + trainer.getUserId() + " exist in repository");

        trainersList.put(trainer.getUserId(),trainer);
        return trainer;
    }

    public Admin add(Admin admin){
        if (adminsList.containsKey(admin.getUserId()))
            throw new IllegalArgumentException("Object id: " + admin.getUserId() + " exist in repository");

        adminsList.put(admin.getUserId(),admin);
        return admin;
    }




}
