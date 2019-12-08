package com.gym.models.workout;

import com.gym.models.users.Trainer;
import com.gym.models.users.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="workout")
public class Workout {

    private int workoutCounter=0;

    @Id
    @Column(name="workoutid")
    private int workoutId;

    @Column(name="maxnumberofmembers")
    private int maxNumberOfMembers;

    @Enumerated(EnumType.STRING)
    @Column(name="workouttype")
    private WorkoutType workoutType;

    @ManyToOne
    @Column(name="userid")
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name="roomid")
    private Room room;

    private Date date;

    public Workout() {this.workoutId=workoutCounter++;}

    public Workout(WorkoutType workoutType, Trainer trainer, Date date, Room room) {
        this.workoutId=workoutCounter++;
        this.workoutType = workoutType;
        this.trainer=trainer;
        this.date = date;
        this.room = room;
        this.maxNumberOfMembers = room.getRoomCapacity();
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public int getMaxNumberOfMembers() {
        return maxNumberOfMembers;
    }

    public void setMaxNumberOfMembers(int maxNumberOfMembers) {
        this.maxNumberOfMembers = maxNumberOfMembers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workout workout = (Workout) o;
        return workoutId == workout.workoutId &&
                maxNumberOfMembers == workout.maxNumberOfMembers &&
                workoutType == workout.workoutType &&
                trainer.equals(workout.trainer) &&
                room.equals(workout.room) &&
                date.equals(workout.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workoutId, maxNumberOfMembers, workoutType, trainer, room, date);
    }

    @Override
    public String toString() {
        return "Workout{" +
                "workoutId=" + workoutId +
                ", maxNumberOfMembers=" + maxNumberOfMembers +
                ", workoutType=" + workoutType +
                ", trainer=" + trainer +
                ", room=" + room +
                ", date=" + date +
                '}';
    }
}
