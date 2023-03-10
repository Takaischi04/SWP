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
        System.out.println(file.getName());
    }

    // call(String)
    public void call(String number) {
        this.sim.call(number);
    }
    // getFreeSpace()
    // printAllFiles()
    public void printAllFiles() {
        List<PhoneFile> files = this.sdMemoryCard.getFiles();
        for (PhoneFile file : files) {
            System.out.println(file.getName());
        }
    }


// SETTER



// GETTER
}
