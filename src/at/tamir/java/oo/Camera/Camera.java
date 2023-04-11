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
    public File takePicture() {
            int size = input.nextInt();
            File file = null;

            switch (size) {
                case 1:
                    System.out.println("Taking small picture");
                    file = new File("small.jpg", 03212023, 2);
                    pictureNumber++;
                    break;

                case 2:
                    System.out.println("Taking medium picture");
                    file = new File("medium.jpg", 03212023, 4);
                    pictureNumber++;
                    break;

                case 3:
                    System.out.println("Taking large picture");
                    file = new File("large.jpg", 03212023, 6);
                    pictureNumber++;
                    break;

                default:
                    System.out.println("Wrong input");
                    break;
            }

            this.sdMemory.savePicture(file);
            System.out.println(file.getPicture());
            return file;
    }
}
