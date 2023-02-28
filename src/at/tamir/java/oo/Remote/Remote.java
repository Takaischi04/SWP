package at.tamir.java.oo.Remote;

import at.tamir.java.oo.Car.Rear_Mirrors;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    // Variables
    private int hasPower;
    private List<Battery> battery;

    private String color;


    // Constuctor: Remote
    public Remote (String color) {
        this.hasPower = hasPower;
        this.battery = new ArrayList<>();
        this.color = color;
    }

    // Add Batteries
    public void addBattery(Battery battery){
        this.battery.add(battery);
    }


    // Feature: getStatus
    public void getStatus(){
        this.hasPower = (getBattery().get(0).getChargingStatus() + getBattery().get(1).getChargingStatus()) / 2;
    }


    // Feature: turnOn()
    public void turnOn(){
        this.hasPower = this.hasPower - 5;
    }


    // Feature: turnOff()


    // Getter
    public int getHasPower() {
        return hasPower;
    }

    public List<Battery> getBattery() {
        return battery;
    }

    public String getColor() {
        return color;
    }


    // Setter
    public void setHasPower(int hasPower) {
        this.hasPower = hasPower;
    }

    public void setBattery(List<Battery> battery) {
        this.battery = battery;
    }

    public void setColor(String color) {
        this.color = color;
    }

}