package at.tamir.java.oo.Phone;

public class SIM {
// VARIABLES
    private int id;
    private String number;


// CONSTRUCTOR
    public SIM(int id, String number) {
        this.id = id;
        this.number = number;
    }


// FEATURES
    // call()
    public void call() {
        System.out.println("SIM " + id + " calls " + number);
    }

// SETTER
    public void setNumber(String number) {
        this.number = number;
    }


// GETTER
    public int getId() {
        return id;
    }
    public String getNumber() {
        return number;
    }

}
