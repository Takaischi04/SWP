package at.tamir.java.oo.Camera;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SD_Memory {
// Instance variables

    private int capacity;
    private List<File> files;

    private int currentSize;


// Constructor
    public SD_Memory(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }


// Methods

    // getAvailableSpace()
    public int getAvailableSpace(){
        currentSize = 0;
        for (File file : files) {
            currentSize += file.getSize();
        }
        return capacity - currentSize;
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


    // addSDMemory
    public void addSDMemory(int addedSDMemory){
        capacity += addedSDMemory;
        System.out.println("added: " + addedSDMemory);
    }


    // Setter


    // Getter
    public int getCapacity() {
        return capacity;
    }

    public int getCurrentSize(){
        return currentSize;
    }
}
