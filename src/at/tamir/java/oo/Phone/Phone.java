package at.tamir.java.oo.Phone;

import java.util.List;

public class Phone {
// VARIABLES
    private Camera camera;
    private SDMemoryCard sdMemoryCard;
    private SIM sim;

// CONSTRUCTOR
    public Phone(Camera camera, SDMemoryCard sdMemoryCard, SIM sim) {
        this.camera = camera;
        this.sdMemoryCard = sdMemoryCard;
        this.sim = sim;
    }


    // FEATURES
    // takePicture()
    public void takePicture() {
        PhoneFile file = this.camera.takePicture();
        this.sdMemoryCard.saveFile(file);
        System.out.println(file.getInfo());
    }


    // call(String)
    public void call(String number) {
        this.sim.call(number);
    }


    // getFreeSpace()
    public int getFreeSpace() {
        return this.sdMemoryCard.getFreeSpace();
    }

    // printAllFiles()
    public List<PhoneFile> getAllFiles() {
        return this.sdMemoryCard.getFiles();
    }


// SETTER



// GETTER
}
