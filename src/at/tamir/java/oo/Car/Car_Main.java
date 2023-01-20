package at.tamir.java.oo.Car;

public class Car_Main {

    // Manage cars
    public static void main(String[] args) {
/*
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A123";
        c1.fuelAmount = 60;
        c1.speed = 60;
        c1.tankVolume = 70;
        c1.amountOfRepetitions = 3;

        Car c2 = new Car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 4;
        c2.serialNumber = "B512";
        c2.fuelAmount = 10;
        c2.speed = 65;
        c2.tankVolume = 70;
*/
        Car c1 = new Car(7,60,"Audi", "A123", "green", 60, 70, 2);

        // Car 1 drive
        System.out.println("Drive!");
        System.out.println("Fuel amount start: " + c1.getFuelAmount());
        c1.getdrive();
        System.out.println("Fuel amount end: " + c1.getFuelAmount());
        System.out.println(" ");

        // Car 1 brake
        System.out.println("Brake!");
        System.out.println("Current speed: " + c1.getSpeed());
        c1.brake();
        System.out.println("Speed after brake: " + c1.getSpeed());
        System.out.println(" ");

        // Car 1 boost
        System.out.println("Turbo Boost!");
        c1.turboBoost();
        System.out.println(" ");

        // Car 1 honk
        c1.honk(c1.getAmountOfRepetitions());
        System.out.println(" ");

        // Car 1 RemainingRange
        c1.getRemainingRange();

        Engine c1 = new Engine(140,Engine.TYPE.DIESEL)

    }
}

