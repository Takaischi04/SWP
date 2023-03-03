package at.tamir.java.oo.Remote;

public class Remote_Main {
    public static void main(String[] args) {
        //Remote
        Remote r1 = new Remote("Black");

        //Battery
        Battery b1 = new Battery(100);
        Battery b2 = new Battery(50);
        r1.addBattery(b1);
        r1.addBattery(b2);


        // Remote 1 Charging Status
        r1.getStatus();
        System.out.println("Charging status is: " + r1.getHasPower() + "%");
        System.out.println(" ");


        // Remote 1 Turn on
        System.out.println("Current status: " + r1.getHasPower() + "%");
        r1.turnOn();
        System.out.println("Battery 1: Consumer connected.");
        System.out.println("Battery 2: Consumer connected.");
        System.out.println("New status with consumer: " + r1.getHasPower() + "%");
        System.out.println(" ");

        //Remote 1 Turn off
        System.out.println("Current status: " + r1.getHasPower() + "%");
        r1.turnOff();
    }
}