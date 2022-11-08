package at.tamir.java.basics.Cross_sum;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int enteredNumber = scanner.nextInt();

        String numberAsString = Integer.toString(enteredNumber);
        char[] numbers = numberAsString.toCharArray();

        int cross_sum1 = 0;
        for (int i = 0; i < numbers.length ; i++) {
            cross_sum1 = cross_sum1 + Character.getNumericValue(numbers[i]);


        }
        String numberAsString2 = Integer.toString(cross_sum1);
        char[] numbers2 = numberAsString2.toCharArray();

        int cross_sum2 = 0;
        for (int j = 0; j < numbers2.length; j++) {
            cross_sum2 = cross_sum2 + Character.getNumericValue(numbers2[j]);
        }
        System.out.println("Cross sum from entered Number: "+ cross_sum1);
        System.out.println("Cross sum from first cross sum "+ cross_sum2);
    }
}