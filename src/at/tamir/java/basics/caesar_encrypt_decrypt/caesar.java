package at.tamir.java.basics.caesar_encrypt_decrypt;

public class caesar {
    public static void main(String[] args) {
        String a = "abc xyz";
        int offset = 1;

        System.out.println("original: " + a);
        System.out.println("encrypted: " + encryptString(a, offset));
        System.out.println("decrypted: " + decrypt(encryptString(a, offset), offset));
        System.out.println((int) 'a');
        System.out.println((int) 'z');

    }

    public static String decrypt(String a, int offset) {
        String ret = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if ((int) c - offset < 97) {
                ret += (char) ((int) c - offset + 26);
            } else {
                ret += (char) ((int) c - offset);
            }
        }
        return ret;
    }

    public static String encryptString(String a, int offset) {
        String ret = "";
        for (int i = 0; i < a.length(); i++) {
            ret += encrypt(a.charAt(i), offset);
        }
        return ret;
    }

    public static char encrypt(char c, int offset) {
        if ((int) c + offset > 122) {
            return (char) ((int) c + offset - 26);
        } else {
            return (char) ((int) c + offset);
        }
    }


}