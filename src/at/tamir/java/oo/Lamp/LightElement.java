package at.tamir.java.oo.Lamp;

public class LightElement {
// Variables

    private String name;
    private String color;
    private int usage;
    public enum STATE {On, Off}
    private STATE state;


// Constructor

    public LightElement(String name, String color, int usage, STATE state) {
        this.name = name;
        this.color = color;
        this.usage = usage;
        this.state = state;
    }


// Methods

    // turnOn()
    public void turnOn() {
        if (this.state == STATE.On) {
            this.usage += 5;
            System.out.println("My name is: " + this.name + " I am already turned on.");
            System.out.println("Current usage: " + this.usage);
        } else {
            this.state = STATE.On;
            this.usage = 5;
            System.out.println("My name is: " + this.name + " I am turned on now");
            System.out.println("Current usage: " + this.usage);
        }
    }

    // turnOff()
    public void turnOff() {
        if (this.state == STATE.Off) {
            this.usage = 0;
            System.out.println("My name is: " + this.name + " I am already turned off.");
            System.out.println("Current usage: " + this.usage);
        } else {
            this.state = STATE.Off;
            this.usage = 0;
            System.out.println("My name is: " + this.name + " I am turned off now");
            System.out.println("Current usage: " + this.usage);
        }
    }



// Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public void setState(STATE state) {
        this.state = state;
    }


// Getter

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getUsage() {
        return usage;
    }

    public STATE getState() {
        return state;
    }
}