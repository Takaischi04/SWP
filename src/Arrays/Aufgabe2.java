package Arrays;

import java.util.Random;

public class Aufgabe2 {
    public static void main(String[] args) {
        Random random = new Random();

        int [] array = new int[50];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(0,100);
            System.out.println(array[i]);
            sum += array[i];
        }
        System.out.println("total of all random numbers: " + sum);
    }
}