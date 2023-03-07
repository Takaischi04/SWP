package at.tamir.java.oo.Phone;

public class Phone {
// VARIABLES
    private String color;
    private Camera camera;
    private SDMemoryCard sdMemoryCard;
    private SIM sim;

// CONSTRUCTOR
    public Phone(String color, Camera camera, SDMemoryCard sdMemoryCard, SIM sim) {
        this.color = color;
        this.camera = camera;
        this.sdMemoryCard = sdMemoryCard;
        this.sim = sim;
    }


    // FEATURES
    // takePicture()
    // call(String)
    public void call(String number) {
        this.sim.call();
    }
    // getFreeSpace()
    // printAllFiles()


// SETTER
    public void setColor(String color) {
        this.color = color;
    }


// GETTER
    public String getColor() {
        return color;
    }
}
