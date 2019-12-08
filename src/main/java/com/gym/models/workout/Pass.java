package com.gym.models.workout;

import com.gym.models.users.User;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="pass")
public class Pass {

    private static int passCounter=0;

    @Id
    @Column(name="passid")
    private int passId;

    @OneToOne
    @JoinColumn(name="userid", referencedColumnName = "userid") // ? czego dotyczy referencedColumnName ?
    private User passOwner;

    private int daysOfAccess;

    @Column(name="endofaccess")
    private Calendar endOfAccess;

    @Column(name="startofaccess")
    private Calendar startOfAccess;

    public Pass() {
        this.passId = passCounter++;
    }

    public Pass(User passOwner, int daysOfAccess) {
        this.passId = passCounter++;
        this.passOwner = passOwner;
        this.daysOfAccess = daysOfAccess;
        this.endOfAccess = Calendar.getInstance();
        this.endOfAccess = Calendar.getInstance();
        endOfAccess.add(Calendar.DAY_OF_MONTH,daysOfAccess);
    }

    public User getPasOwner() {
        return passOwner;
    }

    public void setPasOwner(User pasOwner) {
        this.passOwner = pasOwner;
    }

    public int getDaysOfAccess() {
        return daysOfAccess;
    }

    public void setDaysOfAccess(int daysOfAccess) {
        this.daysOfAccess = daysOfAccess;
    }

    public Calendar getEndOfAccess() {
        return endOfAccess;
    }

    public void setEndOfAccess(Calendar endOfAccess) {
        this.endOfAccess = endOfAccess;
    }

    public Calendar getStartOfAccess() {
        return startOfAccess;
    }

    public void setStartOfAccess(Calendar startOfAccess) {
        this.startOfAccess = startOfAccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pass pass = (Pass) o;
        return passId == pass.passId &&
                passOwner.equals(pass.passOwner) &&
                endOfAccess.equals(pass.endOfAccess) &&
                startOfAccess.equals(pass.startOfAccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passId, passOwner, endOfAccess, startOfAccess);
    }

    @Override
    public String toString() {
        return "Pass{" +
                "passId=" + passId +
                ", passOwner=" + passOwner +
                ", daysOfAccess=" + daysOfAccess +
                ", endOfAccess=" + endOfAccess +
                ", startOfAccess=" + startOfAccess +
                '}';
    }
}
