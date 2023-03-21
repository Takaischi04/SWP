package at.tamir.java.oo.Camera;

public class Lens {
// Variables

    private String producer;
    private int focalLength;


// Constructor
    public Lens(String producer, int focalLength){
        this.producer = producer;
        this.focalLength = focalLength;
    }


// Setter

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setFocalLength(int focalLength) {
        this.focalLength = focalLength;
    }


// Getter

    public String getProducer() {
        return producer;
    }

    public int getFocalLength() {
        return focalLength;
    }
}
