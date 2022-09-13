package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main (String[] args){

        //Array mit 0=14,1=1,2=6, ...
        int [] data = {14,1,6,3,8};
        System.out.println(data[2]);

        // Array vom User gemacht
        int [] userInput = new int[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < userInput.length ; i++) {
            System.out.println("Enter number for num: "+i);
            userInput[i] = scanner.nextInt();
        }
    }
}
