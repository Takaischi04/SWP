package at.tamir.java.oo.Remote;

import at.tamir.java.oo.Car.Rear_Mirrors;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    //Variables
    private int hasPower;
    private List<Battery> battery;

    //Constuctor: Remote
    public Remote (int hasPower) {
        this.hasPower = hasPower;
        this.battery = new ArrayList<>();
    }

    //Method: getStatus

    //Method: turnOn
    //Method: turnOff

    //Getter
    public int getHasPower() {
        return hasPower;
    }

    public List<Battery> getBattery() {
        return battery;
    }

    //Setter
    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }

    public void setBattery(List<Battery> battery) {
        this.battery = battery;
    }


}