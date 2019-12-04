package com.gym.repositories;

import com.gym.models.users.Trainer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TrainerRepository {

    final static protected Map<Integer, Trainer> trainersList = new HashMap<>();



}
