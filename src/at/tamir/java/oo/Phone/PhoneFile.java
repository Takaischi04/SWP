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
    public String getInfo(){
        return this.extension + ":" + this.name + ":" + this.size;
    }
}
