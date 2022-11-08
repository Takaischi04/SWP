package at.tamir.java.basics.Variablen;

public class variablen {
    public static void main(String[] args) {
        System.out.println("Hello");
        int c = 3;
        double d = 10.7;

        boolean isHuman = true;
        String text = "Beispiel text";

        if (c == 4) {
            System.out.println("its 4");
        } else {
            System.out.println("else");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
        }
    }
}