package at.tamir.java.oo.Phone;

public class Main {
    public static void main(String[]args){

// Komponents
        SIM sim = new SIM(1,"9876");
        SDMemoryCard sd = new SDMemoryCard(50000);
        Camera camera = new Camera(1080);
        Phone phone = new Phone(camera,sd,sim);

// Features
        // call()
        phone.call("123123");


        // takePicture()
        phone.takePicture();
        phone.takePicture();


        //printAllFiles()
        phone.printAllFiles();
    }
}
