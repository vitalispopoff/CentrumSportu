package com.gym.models.workout;

import java.util.List;

public class Room {

    private int roomId = hashCode();
    private int roomCapacity;
    private boolean booked;
    private String equipment;
    private List<WorkoutType> allowedWorkouts;

    public Room(int roomCapacity, boolean booked, String equipment, List<WorkoutType> allowedWorkouts) {
        this.roomCapacity = roomCapacity;
        this.booked = booked;
        this.equipment = equipment;
        this.allowedWorkouts = allowedWorkouts;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public List<WorkoutType> getAllowedWorkouts() {
        return allowedWorkouts;
    }

    public void setAllowedWorkouts(List<WorkoutType> allowedWorkouts) {
        this.allowedWorkouts = allowedWorkouts;
    }
}
