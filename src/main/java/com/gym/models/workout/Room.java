package com.gym.models.workout;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="room")
public class Room {

    private int roomCounter=0;

    @Id
    @Column(name="roomid")
    private int roomId;

    @Column(name="roomcapacity")
    private int roomCapacity;
    private boolean booked = false;

    @Column(name="equipment")
    private List<Equipment> equipment = new ArrayList<>();

    @Column(name="allowedworkouts")
    private List<WorkoutType> allowedWorkouts = new ArrayList<>();

    public Room() {this.roomId=roomCounter++;}

    public Room(int roomCapacity) {
        this.roomId=roomCounter++;
        this.roomCapacity = roomCapacity;
    }

    public Room(int roomCapacity, WorkoutType allowedWorkoutType) {
        this.roomId=roomCounter++;
        this.roomCapacity = roomCapacity;
        this.allowedWorkouts.add(allowedWorkoutType);
    }

    public Room(int roomCapacity, Equipment equipment, WorkoutType allowedWorkoutType) {
        this.roomId=roomCounter++;
        this.roomCapacity = roomCapacity;
        this.equipment.add(equipment);
        this.allowedWorkouts.add(allowedWorkoutType);
    }

    public Room(int roomCapacity, List<Equipment> equipment, List<WorkoutType> allowedWorkouts) {
        this.roomId=roomCounter++;
        this.roomCapacity = roomCapacity;
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

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void  setEquipment(Equipment equipment){this.equipment.add(equipment);}

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public List<WorkoutType> getAllowedWorkouts() {
        return allowedWorkouts;
    }

    public void setAllowedWorkouts(WorkoutType allowedWorkouts){this.allowedWorkouts.add(allowedWorkouts);}

    public void setAllowedWorkouts(List<WorkoutType> allowedWorkouts) {
        this.allowedWorkouts = allowedWorkouts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomId == room.roomId &&
                roomCapacity == room.roomCapacity &&
                booked == room.booked &&
                Objects.equals(equipment, room.equipment) &&
                Objects.equals(allowedWorkouts, room.allowedWorkouts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, roomCapacity, booked, equipment, allowedWorkouts);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomCapacity=" + roomCapacity +
                ", booked=" + booked +
                ", equipment=" + equipment +
                ", allowedWorkouts=" + allowedWorkouts +
                '}';
    }
}
