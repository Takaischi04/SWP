package at.tamir.java.oo.Phone;
import java.util.ArrayList;
import java.util.List;

public class SDMemoryCard {
// VARIABLES
    private int capacity;
    private List<PhoneFile> files;

// CONSTRUCTOR
    public SDMemoryCard(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }


// FEATUERS
    // saveFile()
    public void saveFile(PhoneFile file) {
        files.add(file);
    }


    // getAllFiles() -> phoneFiles
    public List<PhoneFile> getFiles() {
        return files;
    }


    // getFreeSpace()
    public int getFreeSpace() {
        int size = 0;
        for (PhoneFile file : files) {
            size += file.getSize();
        }

        return capacity - size;
    }


// SETTER
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


// GETTER
    public int getCapacity() {
        return capacity;
    }

}