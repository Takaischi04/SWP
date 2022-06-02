package Test;

import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        Random random = new Random();

        int number1 = random.nextInt(0, 1000);
        int number2 = random.nextInt(number1);

        System.out.println("random groesser: " + number1);
        System.out.println("random kleiner: " + number2);

        for (int i = number1; i> number2; i--  )
            System.out.println(i);


    }
}