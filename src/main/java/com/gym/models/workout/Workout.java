package com.gym.models.workout;

import java.util.Date;

public class Workout {

    private int workoutId = hashCode();
    private WorkoutType workoutType;
    private Date date;
    private Room room;
    private int maxNumberOfMembers;

    public Workout(WorkoutType workoutType, Date date, Room room) {
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
