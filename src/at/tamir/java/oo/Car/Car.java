package at.tamir.java.oo.Car;

public class Car {
    //Gedächtnissvariablen
    private Engine engine;
    private int fuelConsumption;
    private int fuelAmount;
    private String brand;
    private String serialNumber;
    private String color;
    private int speed;
    private int tankVolume;
    private int amountOfRepetitions;
    private int remainingRange;

    //Konstruktor
    public Car(int fuelConsumption, int fuelAmount, String brand, String serialNumber, String color, int speed, int tankVolume, int amountOfRepetitions){
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
        this.speed = speed;
        this.tankVolume = tankVolume;
        this.amountOfRepetitions = amountOfRepetitions;
    }

    public Car(Engine engine, String brand, String color) {
        this.engine = engine;
        this.brand = brand;
        this.color = color;
    }

    //Car drives
    public void getdrive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Car is driving");
    }

    //Car brakes
    public void brake() {
        this.speed = 0;
        System.out.println("Car is braking");
    }

    //Turbo boost
    public void turboBoost() {
        if (this.fuelAmount > this.tankVolume * 0.1) {
            System.out.println("Super Boost Mode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    //Honk
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuut");
        }
    }

    //Remaining Range
    public void getRemainingRange() {
        this.remainingRange = this.fuelAmount / this.fuelConsumption;
        if (this.fuelAmount == 0) {
            System.out.println("Can't drive any further");
        } else {
            System.out.println("You can drive " + this.remainingRange + " times before fuel is out");
        }
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

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setRemainingRange(int remainingRange) {
        this.remainingRange = remainingRange;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    // Getter
    public int getAmountOfRepetitions() {
        return amountOfRepetitions;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTankVolume() {
        return tankVolume;
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

