package at.tamir.java.oo.Car;

public class Rear_Mirrors {

    // variables
    private int size;
    private int position;

    // Constructor: Rear_Mirrors
    public Rear_Mirrors(int size, int position) {
        this.size = size;
        this.position = position; // 0 neutral, - links, + rechts
    }


    // Setter
    public void setSize(int size) {
        this.size = size;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    // Getter
    public int getSize() {
        return size;
    }

    public int getPosition() {
        return position;
    }
}
