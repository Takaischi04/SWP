package IfBedingungen;

import java.util.Random;

public class IF_Bedingung_Aufgabe2 {
    public static void main(String[]args){
        //Erstellen zwei Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int zahl1 = random.nextInt(100);
        int zahl2 = random.nextInt (100);

        System.out.println("Zahl 1: "+ zahl1);
        System.out.println("Zahl 2: "+ zahl2);

        //Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50
        //dann gib aus "Zahl 1 ist kleiner als Zahl 2 und Mini"
        if (zahl1 < zahl2 && zahl1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        //Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30
        //dann gib aus "Einer der beiden ist kleiner als 30"
        else if (zahl1 < 30 || zahl2 < 30) {
            System.out.println("Einer der beiden ist kleiner als 30");
        }

        //Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        //dann gib aus "Erste Zahl klein, zweite kein 50er"
        else if (zahl1 < 50 && zahl2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50er");
        } else {
        }
    }
}
