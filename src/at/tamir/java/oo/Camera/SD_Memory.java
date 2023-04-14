package at.tamir.java.oo.Camera;
import java.util.ArrayList;
import java.util.List;

public class SD_Memory {
// Instance variables

    private int capacity;
    private List<File> files;


// Constructor
    public SD_Memory(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }


// Methods

    // getAvailableSpace()
    public int getAvailableSpace(){
        int size = 0;
        for (File file : files) {
            size += file.getSize();
        }
        return capacity - size;
    }

    // savePicture()
    public void savePicture(File file) {
        int availableSpace = getAvailableSpace();
        if (availableSpace < file.getSize()) {
            System.out.println("No space available. Add SD-Memory Card");
        } else {
            files.add(file);
            System.out.println("Picture saved. Remaining space: " + (availableSpace - file.getSize()));
        }
    }

    // showAllPictures
    public List<File> showAllPictures() {
        return files;
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
