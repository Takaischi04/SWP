package at.tamir.java.basics.Calendar;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calendar {
    public static void main(String[]args) {

        //get the starting month

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting month ");
        int inputMonth = scanner.nextInt();

        if (inputMonth > 12) {
            System.out.println("Entered number is unavailable");
            System.exit(1);
        }

        int amountOfDays = 0;


        //get the starting day

        System.out.println("Enter the starting day (1 = Monday; 2 = Tuesday; ...)");
        int inputDay = scanner.nextInt();

        if (inputDay > 7) {
            System.out.println("Entered number is unavailable");
            System.exit(2);
        }

        System.out.println("Starting point:");
        switch (inputDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        switch (inputMonth) {
            case 1:
                System.out.println("January");
                amountOfDays = 31;
                break;
            case 2:
                System.out.println("February");
                amountOfDays = 28;
                break;
            case 3:
                System.out.println("March");
                amountOfDays =31;
                break;
            case 4:
                System.out.println("April");
                amountOfDays = 30;
                break;
            case 5:
                System.out.println("May");
                amountOfDays = 31;
                break;
            case 6:
                System.out.println("June");
                amountOfDays = 30;
                break;
            case 7:
                System.out.println("July");
                amountOfDays = 31;
                break;
            case 8:
                System.out.println("August");
                amountOfDays = 31;
                break;
            case 9:
                System.out.println("September");
                amountOfDays = 30;
                break;
            case 10:
                System.out.println("October");
                amountOfDays = 31;
                break;
            case 11:
                System.out.println("November");
                amountOfDays = 30;
                break;
            case 12:
                System.out.println("December");
                amountOfDays = 31;
                break;
        }

        //create the calendar

        String[] dayOfTheWeek = {"| MO |", "| TU |", "| WE |", "| TH |", "| FR |", "| SA |", "| SU |"};
        for (int i = 0; i < dayOfTheWeek.length; i++) {
            System.out.print(dayOfTheWeek[i]);
        }

        System.out.println(" ");

        // create the shift
        for (int x = 1; x < inputDay; x++) {
            System.out.print("| -- |");
        }

        for (int i = 1; i <= amountOfDays; i++) {
                if (i < 10) {
                    System.out.print("| " + i +"  |");
                } else {
                    System.out.print("| " + i + " |");
                }

                if ((i+inputDay-1) % 7 == 0){
                    System.out.println(" ");
            }
        }
    }
}
