package at.tamir.java.basics.Cross_sum;

public class Task3 {
    public static void main (String[] args){
        // create the numbers and the cross sums
        for (int i = 0; i <= 1000; i++) {
            String numberAsString = Integer.toString(i);
            char[] numbers = numberAsString.toCharArray();

            int sum = 0;
            for (int cs = 0; cs < numbers.length; cs++) {
                sum = sum + Character.getNumericValue(numbers[cs]);
            }


            int[] arraysum = new int [] {sum};
            int[] arraycounter = new int [arraysum.length];
            int counted = -1;
            for (int a = 0; a < arraysum.length; a++) {
                int count = 1;
                for (int b = a+1; b < arraysum.length; b++) {
                    if (arraysum[a] == arraysum[b]){
                        count ++;
                        arraycounter[b] = counted;
                    }
                }
                if (arraycounter[a] != counted){
                    arraycounter[a] = count;
                }
            }
            for (int a = 0; a < arraycounter.length; a++) {
                if(arraycounter[a] != counted) {
                    System.out.println("Frequency of: "+ arraysum[a] + "  occurrs: "+ arraycounter[a]);
                }
            }
        }
    }
}