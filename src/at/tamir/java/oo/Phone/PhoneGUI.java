package at.tamir.java.oo.Phone;
import java.util.List;
import java.util.Scanner;

public class PhoneGUI {
    private Phone phone;

    public PhoneGUI(Phone phone) {
        this.phone = phone;
    }

    public void run(){
        System.out.println("Phone GUI");

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("1 make call");
            System.out.println("2 take picture");
            System.out.println("3 show space");
            System.out.println("4 show Files");
            System.out.println(" ");

            int choice = input.nextInt();
            switch (choice){
                case 1:
                    phone.call("06762192");
                    System.out.println(" ");
                    break;
                case 2:
                    phone.takePicture();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Available space: "+phone.getFreeSpace());
                    System.out.println("");
                    break;
                case 4:
                    List<PhoneFile> files = phone.getAllFiles();
                    for (PhoneFile file : files) {
                        System.out.println(file.getInfo());
                    }
                    System.out.println(" ");
                    break;
                default:
                    break;
            }
        }
    }
}
