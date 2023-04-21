package at.tamir.java.oo.Camera;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Objects

        Lens lens = new Lens("Sony", 10);
        SD_Memory sdMemory = new SD_Memory(16);
        Camera camera = new Camera("cam", "Austria", 1080, 600, "black", lens, sdMemory);


// use Methods

        while (true) {
            System.out.println(" ");
            System.out.println("Choose size of Picture");
            System.out.println("1. Small, 2GB");
            System.out.println("2. Medium, 4GB");
            System.out.println("3. Large, 6GB");
            System.out.println("4. Add SD-Memory Card");
            System.out.println(" ");

            // takePicture()
            camera.takePicture();
            System.out.println(" ");

            // showAllPictures
            System.out.println("History of pictures");
            List<File> files = sdMemory.showAllPictures();
            for (File file : files) {
                System.out.println(file.getPicture());
            }
        }
    }
}