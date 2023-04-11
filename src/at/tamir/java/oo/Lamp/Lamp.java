package at.tamir.java.oo.Lamp;
import java.util.ArrayList;
import java.util.List;

public class Lamp {

// Variables

    private List<LightElement> lightElements;


    // Constructors
    public Lamp() {
        lightElements = new ArrayList<LightElement>();
    }

// Methods

    // addLightElement(LightElement)
    public void addLightElement(LightElement lightElement) {
        lightElements.add(lightElement);
        System.out.println(lightElement.getName() + " added to Lamp");
    }


    // turnAllOn()
    public void turnAllOn() {
        for (LightElement lightElement : lightElements) {
            lightElement.turnOn();
        }
    }


    // getOverallPower()
    public void getOverallPower() {
        int overAllPower = 0;
        for (LightElement lightElement : lightElements) {
            overAllPower += lightElement.getUsage();
        }
        System.out.println("Overall power usage: " + overAllPower);
    }


    // printNamesOfLightElements()
    public void printNamesOfLightElements() {
        for (LightElement lightElement : lightElements) {
            System.out.println(lightElement.getName());
        }
    }
}