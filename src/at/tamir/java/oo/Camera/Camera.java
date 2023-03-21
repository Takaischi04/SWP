package at.tamir.java.oo.Camera;
import java.util.Scanner;

public class Camera {
// Add Scanner
    Scanner input = new Scanner(System.in);


// Variables

    private String name;
    private String country;
    private int pixel;
    private int weight;
    private String color;
    private Lens lens;
    private SD_Memory sdMemory;
    private int pictureNumber = 0;


// Constructor
    public Camera(String name, String country, int pixel, int weight, String color, Lens lens, SD_Memory sdMemory) {
        this.name = name;
        this.country = country;
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.lens = lens;
        this.sdMemory = sdMemory;
    }


// Features

    //takePicture()
    public void takePicture() {
        System.out.println("Choose size of Picture");
        System.out.println("1. Small, 2GB");
        System.out.println("2. Medium, 4GB");
        System.out.println("3. Large, 6GB");

        int size = input.nextInt();
        switch (size) {
            case 1:
                System.out.println("Taking small picture");
                File file = new File("small.jpg", 03212023, 2 + pictureNumber);
                pictureNumber ++;

                break;

            case 2:
                System.out.println("Taking medium picture");

                break;

            case 3:
                System.out.println("Taking large picture");

                break;
        }
    }

}
