package Arrays;

public class Aufgabe1 {
    public static void main(String[] args) {

        int [] data = {0,1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int i = data [0]; i < data.length ; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("Summe: " + sum);
    }
}