package Switch_Statement;

import java.util.Random;

public class Switch_Statement {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 5
        Random random = new Random();
        int randomNumber = random.nextInt(5);

        switch (randomNumber) {
            case 0:
                System.out.println("is 0");
                break;
            case 1:
                System.out.println("is 1");
                break;
            case 2:
                System.out.println("is 2");
                break;
            default:
                System.out.println("other Value");

        }

        // Gib die Zufallszahl aus
        System.out.println(randomNumber);


    }
}