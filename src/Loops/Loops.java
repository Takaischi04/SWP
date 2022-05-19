package Loops;

import java.util.Random;

public class Loops {
    public static void main(String[] args) {
        Random random = new Random();
        int RandomNumber = random.nextInt(5);

        //for Schleife
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello " + i);
        }
    }
}