package com.gym.models.workout;

import com.gym.models.users.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

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
    private WorkoutType workoutType;
    private Date date;
    private Room room;

    public Workout() {this.workoutId=workoutCounter++;}

    public Workout(WorkoutType workoutType, Date date, Room room) {
        this.workoutId=workoutCounter++;
        this.workoutType = workoutType;
        this.date = date;
        this.room = room;
        this.maxNumberOfMembers = room.getRoomCapacity();
    }

    public int getWorkoutId() {
        return workoutId;
    }

   /* public void setId(int id) {
        this.id = id;
    }*/

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

    public int getMaxNumberOfMembers() {
        return maxNumberOfMembers;
    }

    public void setMaxNumberOfMembers(int maxNumberOfMembers) {
        this.maxNumberOfMembers = maxNumberOfMembers;
    }
}
