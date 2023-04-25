package at.tamir.java.oo.Camera;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            System.out.println("4. Add 16GB SD-Memory Card");
            System.out.println(" ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // takePicture()
            if (choice == 4) {
                sdMemory.addSDMemory(32);
                System.out.println("SD-Memory Card added.");
            } else {
                camera.takePicture(choice);
            }
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