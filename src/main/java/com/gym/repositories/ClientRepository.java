package com.gym.repositories;

import com.gym.models.users.Client;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ClientRepository {

    final static protected Map<Integer, Client> clientsList = new HashMap<>();

}
