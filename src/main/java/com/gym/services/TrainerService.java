package com.gym.services;

import com.gym.repositories.TrainerRepository;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    private TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }
}
