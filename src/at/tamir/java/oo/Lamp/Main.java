package at.tamir.java.oo.Lamp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Components
        Lamp lamp = new Lamp();

        // Create LightElements
        LightElement lightElement1 = new LightElement("Lamp Name 1", "white", 0, LightElement.STATE.Off);
        LightElement lightElement2 = new LightElement("Lamp Name 2", "blue", 0, LightElement.STATE.Off);
        LightElement lightElement3 = new LightElement("Lamp Name 3", "yellow", 0, LightElement.STATE.Off);
        LightElement lightElement4 = new LightElement("Lamp Name 4", "red", 0, LightElement.STATE.Off);



// Methods

        // addLightElement()
        System.out.println("addLightElement: ");
        lamp.addLightElement(lightElement1);
        lamp.addLightElement(lightElement2);
        lamp.addLightElement(lightElement3);
        lamp.addLightElement(lightElement4);
        System.out.println("---");
        System.out.println(" ");


        // turnAllOn()
        System.out.println("turnAllOn: ");
        lamp.turnAllOn();
        System.out.println("---");
        System.out.println(" ");


        // getOverAllPower
        System.out.println("getOverAllPower: ");
        lamp.getOverallPower();
        System.out.println("---");
        System.out.println(" ");


        // printNamesOfLightElements
        System.out.println("printNamesOfLightElements: ");
        lamp.printNamesOfLightElements();
        System.out.println("---");
        System.out.println(" ");


        // turnOn()
        System.out.println("turnOn: ");
        lightElement1.turnOn();
        System.out.println("---");
        System.out.println(" ");

        // 2x turnOff()
        System.out.println("2x turnOff: ");
        lightElement1.turnOff();
        lightElement1.turnOff();
        System.out.println("---");
    }
}
