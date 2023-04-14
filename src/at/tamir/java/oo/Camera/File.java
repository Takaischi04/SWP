package at.tamir.java.oo.Camera;
import java.time.LocalDate;

public class File {
// Instance variables

    private String name;
    private LocalDate date;
    private int size;


// Constructor
    public File(String name, LocalDate date, int size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }


// Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setSize(int size) {
        this.size = size;
    }


// Getter

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getSize() {
        return size;
    }

    public String getPicture(){
        return this.date + ":" + this.name + "   size:" + this.size;
    }

}