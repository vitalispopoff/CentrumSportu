package com.gym.models.workout;

import com.gym.models.users.Client;

public class Reservation {

    private Client client;
    private Workout workout;
    private int reservationId;

    public Reservation(Client client, Workout workout) {
        this.reservationId = hashCode();
        this.client = client;
        this.workout = workout;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
