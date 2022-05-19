package Loops_While;

import java.util.Random;

public class While_Loop_Aufgabe1 {
    public static void main(String[] args) {
        //Erstelle ein Programm, dass Zufallszahlen zwischen 10 und 30 generiert. Das Programm soll die Zufallszahl zusammenzählen.
        //Sobald die Zahl 15 oder die Zahl 25 kommt, wird das Programm beenden und die Summer der vorherigen Zufallszahlen ausgegeben
        Random random = new Random();
        int RandomNumber = random.nextInt(10, 30);
        boolean Number = false;

        while (!Number) {
            if (RandomNumber == 15 || RandomNumber == 25) {
                Number = true;
                System.out.println("Zahl ist 15 oder 25");
            } else {
                RandomNumber = random.nextInt(10,30);
                Number = false;
                System.out.println(RandomNumber);
            }

        }
    }
}