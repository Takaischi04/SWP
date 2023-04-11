package at.tamir.java.oo.Camera;
import java.util.ArrayList;
import java.util.List;

public class SD_Memory {
// Variables

    private int capacity;
    private List<File> files;


// Constructor
    public SD_Memory(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }


// Features

    // savePicture()
    public void savePicture(File file) {
        files.add(file);
    }

    // getAvailableSpace
    public int getAvailableSpace(){
        int size = 0;
        for(File file : files) {
            size += file.getSize();
        }
        return capacity - size;
    }


// Setter
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


// Getter
    public int getCapacity() {
        return capacity;
    }
}
