package at.tamir.java.oo.Car;

public class Car_Main {

    // Manage cars
    public static void main(String[] args) {

        //Engine
        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, 100, 200, 50);

        //Tank
        Tank t1 = new Tank(5, 50, 50);

        //Car
        Car c1 = new Car("Audi","A123","green", 3, e1, t1);


        // Car 1 drive
        System.out.println("Drive!");
        e1.getdrive();
        System.out.println(" ");

        // Car 1 brake
        System.out.println("Brake!");
        System.out.println("Current speed: " + e1.getSpeed());
        e1.brake();
        System.out.println("Speed after brake: " + e1.getSpeed());
        System.out.println(" ");

        // Car 1 boost
        System.out.println("Turbo Boost!");
        t1.turboBoost();
        System.out.println(" ");

        // Car 1 honk
        e1.honk(c1.getAmountOfRepetitions());
        System.out.println(" ");

        // Car 1 RemainingRange
        t1.getRemainingRange();
    }
}

