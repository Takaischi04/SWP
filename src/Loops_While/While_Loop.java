package Loops_While;

import java.sql.SQLOutput;
import java.util.Random;

public class While_Loop {
    public static void main(String[]args) {

        Random random = new Random();
        boolean isFinished = false;

        while (!isFinished) {
            int randomValue = random.nextInt (100);
            System.out.println("Nr: "+randomValue);

            if (randomValue>90) {
                isFinished=true;
            }

        }
        System.out.println("Finished");
    }
}
