package at.tamir.java.oo.Camera;
import java.time.LocalDate;
import java.util.Scanner;

public class Camera {
    // Add Scanner
    Scanner input = new Scanner(System.in);


// Instance variables

    private String name;
    private String country;
    private int pixel;
    private int weight;
    private String color;
    private Lens lens;
    private SD_Memory sdMemory;



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


// Methods

    //takePicture()
    public File takePicture() {
        if (this.sdMemory == null) {
            System.out.println("Please insert SD Memory Card");
        } else {

            int size = input.nextInt();
            File file = null;

            switch (size) {
                case 1:
                    System.out.println("Taking small picture");
                    file = new File("small.jpg", LocalDate.now(), 2);
                    break;

                case 2:
                    System.out.println("Taking medium picture");
                    file = new File("medium.jpg", LocalDate.now(), 4);
                    break;

                case 3:
                    System.out.println("Taking large picture");
                    file = new File("large.jpg", LocalDate.now(), 6);
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }

            sdMemory.savePicture(file);
            System.out.println("Taken picture: " + file.getPicture());
            return file;
        }
        return null;
    }
}
