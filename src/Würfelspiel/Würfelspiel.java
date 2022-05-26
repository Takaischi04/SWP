package Würfelspiel;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        boolean finish = false;

        while (!finish) {

            System.out.println("choose the amount of dice (max. 6)");

            Random random = new Random();
            Scanner scanner = new Scanner(System.in);

            int amount = scanner.nextInt();

            //player
            int pdice1 = random.nextInt(1, 6);
            int pdice2 = random.nextInt(1, 6);
            int pdice3 = random.nextInt(1, 6);
            int pdice4 = random.nextInt(1, 6);
            int pdice5 = random.nextInt(1, 6);
            int pdice6 = random.nextInt(1, 6);
            int pscore = 0;

            //Computer
            int cdice1 = random.nextInt(1, 6);
            int cdice2 = random.nextInt(1, 6);
            int cdice3 = random.nextInt(1, 6);
            int cdice4 = random.nextInt(1, 6);
            int cdice5 = random.nextInt(1, 6);
            int cdice6 = random.nextInt(1, 6);
            int cscore = 0;

            //amount of dice
            switch (amount) {
                case 1:
                    pscore = pdice1;
                    cscore = cdice1;
                    System.out.println("your score: " + pscore);
                    System.out.println("opponent score: " + cscore);
                    break;

                case 2:
                    pscore = pdice1 + pdice2;
                    cscore = cdice1 + cdice2;
                    System.out.println("your score: " + pdice1 + ", " + pdice2 + "= " + pscore);
                    System.out.println("opponent score: " + cdice1 + ", " + cdice2 + "= " + cscore);
                    break;

                case 3:
                    pscore = pdice1 + pdice2 + pdice3;
                    cscore = cdice1 + cdice2 + cdice3;
                    System.out.println("your score: " + pdice1 + ", " + pdice2 + ", " + pdice3 + "= " + pscore);
                    System.out.println("opponent score: " + cdice1 + ", " + cdice2 + ", " + cdice3 + "= " + cscore);
                    break;

                case 4:
                    pscore = pdice1 + pdice2 + pdice3 + pdice4;
                    cscore = cdice1 + cdice2 + cdice3 + cdice4;
                    System.out.println("your score: " + pdice1 + ", " + pdice2 + ", " + pdice3 + ", " + pdice4 + "= " + pscore);
                    System.out.println("opponent score: " + cdice1 + ", " + cdice2 + ", " + cdice3 + ", " + cdice4 + "= " + cscore);
                    break;

                case 5:
                    pscore = pdice1 + pdice2 + pdice3 + pdice4 + pdice5;
                    cscore = cdice1 + cdice2 + cdice3 + cdice4 + cdice5;
                    System.out.println("your score: " + pdice1 + ", " + pdice2 + ", " + pdice3 + ", " + pdice4 + ", " + pdice5 + "= " + pscore);
                    System.out.println("opponent score: " + cdice1 + ", " + cdice2 + ", " + cdice3 + ", " + cdice4 + ", " + cdice5 + "= " + cscore);
                    break;

                case 6:
                    pscore = pdice1 + pdice2 + pdice3 + pdice4 + pdice5 + pdice6;
                    cscore = cdice1 + cdice2 + cdice3 + cdice4 + cdice5 + cdice6;
                    System.out.println("your score: " + pdice1 + ", " + pdice2 + ", " + pdice3 + ", " + pdice4 + ", " + pdice5 + ", " + pdice6 + "= " + pscore);
                    System.out.println("opponent score: " + cdice1 + ", " + cdice2 + ", " + cdice3 + ", " + cdice4 + ", " + cdice5 + ", " + cdice6 + "= " + cscore);
                    break;

                default:
                    System.out.println("please enter a valid number");
            }

            //Win condition

            if (pscore > cscore) {
                System.out.println("you won");
            } else if (pscore < cscore) {
                System.out.println("you lose");
            } else {
                System.out.println("its a draw");
            }

            System.out.println(" "); //Space

            boolean valid = false;
            while (!valid) {
                System.out.println("press 1 for another round");
                System.out.println("press 2 if finished");
                int retry = scanner.nextInt();

                switch (retry) {
                    case 1:
                        finish = false;
                        valid = true;
                        break;

                    case 2:
                        finish = true;
                        valid = true;
                        break;

                    default:
                        System.out.println("please enter a valid number");
                        valid = false;
                }
            }

            System.out.println(" "); //Space

        }

    }
}