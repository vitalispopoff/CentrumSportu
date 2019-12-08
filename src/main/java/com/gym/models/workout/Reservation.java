package com.gym.models.workout;

import com.gym.models.users.Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="reservation")
public class Reservation {

    private int reservationCounter=0;

    @Id
    @Column(name="reservationid")
    private int reservationId;

    private Client client;
    private Workout workout;

    public Reservation() {this.reservationId=reservationCounter++;}

    public Reservation(Client client, Workout workout) {
        this.reservationId=reservationCounter++;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reservation that = (Reservation) o;
        return reservationCounter == that.reservationCounter &&
                reservationId == that.reservationId &&
                client.equals(that.client) &&
                workout.equals(that.workout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reservationCounter, reservationId, client, workout);
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationCounter=" + reservationCounter +
                ", reservationId=" + reservationId +
                ", client=" + client +
                ", workout=" + workout +
                '}';
    }
}
