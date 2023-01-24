package at.tamir.java.oo.Car;

public class Engine {

    private int speed;
    private int maxSpeed;
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE type;

    private int gasPedal;

    public Engine(int horsePower, TYPE type, int speed, int maxSpeed, int gasPedal){
        this.horsePower = horsePower;
        this.type = type;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.gasPedal = gasPedal;
    }

    //Car drives
    public void getdrive() {
        this.speed = this.maxSpeed / this.gasPedal;
        System.out.println("Car ist driving with: " + this.speed + "km/h");
    }


    //Feature: brake
    public void brake() {
        this.speed = 0;
        System.out.println("Car is braking");
    }

    //Feature: honk
    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuut");
        }
    }


    //setter
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    //getter
    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
