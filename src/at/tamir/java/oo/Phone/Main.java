package at.tamir.java.oo.Phone;

public class Main {
    public static void main(String[]args){

// Komponents
        SIM sim = new SIM(1,"9876");
        SDMemoryCard sd = new SDMemoryCard(5000);
        Camera camera = new Camera(1080);
        Phone phone = new Phone(camera,sd,sim);

// Connection to PhoneGUI
        PhoneGUI gui = new PhoneGUI(phone);
        gui.run();
    }
}
