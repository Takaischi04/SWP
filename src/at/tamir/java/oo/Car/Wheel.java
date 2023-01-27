package at.tamir.java.oo.Car;

public class Wheel {
    // Variables
    private int pressure;
    public enum season {Winter, Summer}
    private int size;
    private season type;


    // Constructor: Wheel
    public Wheel(int pressure, season type, int size){
        this.pressure = pressure;
        this.type = type;
        this.size = size;
    }


    // Setter
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(season type) {
        this.type = type;
    }


    // Getter
    public int getPressure() {
        return pressure;
    }

    public int getSize() {
        return size;
    }

    public season getType() {
        return type;
    }
}
