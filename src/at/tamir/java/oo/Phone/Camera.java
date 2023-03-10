package at.tamir.java.oo.Phone;

public class Camera {
// VARIABLES
    private int resolution;
    private int fileNumber = 0;

// CONSTRUCTOR
    public Camera(int resolution) {
        this.resolution = resolution;

    }


    // FEATURES
    // takePicture() -> PhoneFile
    public PhoneFile takePicture() {
        System.out.println("Taking picture");
        PhoneFile file = new PhoneFile("jpg", 1000, "picture" + fileNumber);
        fileNumber++;
        return file;
    }

// SETTER
    public void setResolution(int resolution) {
        this.resolution = resolution;
    }


// GETTER
    public int getResolution() {
        return resolution;
    }
}