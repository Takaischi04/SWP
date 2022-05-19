package Switch_Statement;

import java.util.Random;

public class Switch_Aufgabe1 {
    public static void main(String[]args){
        //Erstelle eine Zufallszahl zwischen5 und 10
        Random random = new Random();
        int RandomNumber = random.nextInt(5,10);
        System.out.println(RandomNumber);

        //Wenn der Wert 10 ist gib aus "Ten"
        //Wenn der Wert 9 ist gib aus "Nine"
        //Wenn der Wert 8 ist gib aus "Eight"
        // usw.
        switch (RandomNumber) {
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
        }

    }
}
