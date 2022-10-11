package Cross_sum;

public class Task1 {
    public static void main(String[] args) {


        for (int i = 0; i <= 1000; i++) {
            String numberAsString = Integer.toString(i);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int cs = 0; cs < numbers.length; cs++) {
                sum = sum + Character.getNumericValue(numbers[cs]);
            }
            if (sum == 15) {
                System.out.println("number: " + i + "     crossum: "+ sum );
            }
        }

    }
}
