package Test;

import java.util.Random;

public class Example2 {
    public static void main (String[]args) {
        boolean loop = false;
        Random random = new Random();
        int gesamt = 0;

        while (!loop) {
            int funf = random.nextInt(0,10);
            System.out.println("zahl"+funf);

            if (funf == 5) {
                loop = true;
                System.out.println("gesamt: "+gesamt);

            } else {
                loop = false;
                gesamt +=funf;
            }
        }
    }
}
