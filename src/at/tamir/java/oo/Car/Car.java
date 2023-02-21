package at.tamir.java.oo.Car;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String serialNumber;
    private String color;
    private int amountOfRepetitions;
    private Engine engine;
    private Tank tank;
    private List<Rear_Mirrors> mirrors;


    //Constructor: Car
    public Car(String brand, String serialNumber, String color, int amountOfRepetitions, Engine engine, Tank tank) {
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.amountOfRepetitions = amountOfRepetitions;
        this.engine = engine;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
    }


    //add mirror
    public void addMirror(Rear_Mirrors rear_mirrors){
        this.mirrors.add(rear_mirrors);
    }

    //create rear mirror list
    public List<Rear_Mirrors> getMirrors() {
        return mirrors;
    }

    //Setter
    public void setAmountOfRepetitions(int amountOfRepetitions) {
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Getter
    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


}

