package at.tamir.java.oo.Phone;

public class PhoneFile {
// variables
    private String extension;
    private int size;
    private String name;


// Constructor
    public PhoneFile(String extension, int size, String name) {
        this.extension = extension;
        this.size = size;
        this.name = name;
    }

/*
// Setter
    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setSize(int size) {
        this.size = size;
    }
*/

// Getter
    public String getExtension() {
        return extension;
    }

    public int getSize() {
        return size;
    }
    public String getName() {
        return name;
    }
}
