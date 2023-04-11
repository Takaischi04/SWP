package at.tamir.java.oo.Camera;

public class Main {
    public static void main(String[] args) {
// Components

        Lens lens = new Lens("Sony", 10);
        SD_Memory sdMemory = new SD_Memory(64);
        Camera camera = new Camera("cam", "Austria", 1080,600,"black", lens, sdMemory);


// Features

        while (true) {
            System.out.println("Choose size of Picture");
            System.out.println("1. Small, 2GB");
            System.out.println("2. Medium, 4GB");
            System.out.println("3. Large, 6GB");
            System.out.println(" ");

            // takePicture()
            camera.takePicture();

            // getAvailableSpace()
            System.out.println("getAvailableSpace");
            System.out.println("Remaining space: " + sdMemory.getAvailableSpace());
            System.out.println("---");
        }
    }
}
