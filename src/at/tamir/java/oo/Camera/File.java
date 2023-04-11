package at.tamir.java.oo.Camera;

public class File {
// Variables

    private String name;
    private int date;
    private int size;


// Constructor
    public File(String name, int date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }


// Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setSize(int size) {
        this.size = size;
    }


// Getter

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public String getPicture(){
        return this.date + ":" + this.name + "   size:" + this.size;
    }

}