package com.gym.models.workout;

import com.gym.models.users.User;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pass {

    private User passOwner;
    private int passId;
    private int daysOfAccess;
    private Calendar endOfAccess;
    private Calendar startOfAccess;

    public Pass(User passOwner, int daysOfAccess) {
        this.passId = hashCode();
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
}
