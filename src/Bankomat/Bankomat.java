package Bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int balance = 0;
        boolean end = false;
            System.out.println("1. Add money into account");
            System.out.println("2. withdraw money from your account");
            System.out.println("3. current balance");
            System.out.println("4. close");

        while (!end) {
            System.out.println("what do you want to do?");
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            switch (selection) {

                case 1:
                    System.out.println("How much should go into your account?");
                    int plus = scanner.nextInt();
                    balance = balance + plus;
                    System.out.println("Added " + plus + " into your account.");
                    break;

                case 2:
                    System.out.println("How much should be taken out?");
                    int minus = scanner.nextInt();
                    balance = balance - minus;
                    System.out.println("took " + minus +" out from your account.");
                    break;

                case 3:
                    System.out.println("Your Balance: " + balance);
                    break;

                case 4:
                    end = true;
                    System.out.println("Bye!");

                default:
                    System.out.println("Please select one of the given numbers!");

            }
        }
    }
}