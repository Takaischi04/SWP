package Bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        boolean end = false;
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            int Balance = 0;

        while (!end) {
            System.out.println("what do you want to do?");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("How much should go into your account?");
                int plus = scanner.nextInt();
                System.out.println("Added " + plus + " into your account");

            } else if (selection == 2) {
                System.out.println("How much should be taken out?");
                int minus = scanner.nextInt();
                System.out.println("took " + minus +" out from your account");

            } else if (selection == 3) {
                System.out.println("Your Balance: " + Balance);


            } else if (selection == 4) {
                end = true;
                System.out.println("Bye!");

            } else {
                System.out.println("Please select one of the given numbers");
            }
        }
    }
}


