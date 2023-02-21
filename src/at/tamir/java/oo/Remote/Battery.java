package at.tamir.java.oo.Remote;

public class Battery {
    //Variables
    private int chargingStatus;

    //Constructor: Battery
    public Battery (int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    //Getter
    public int getChargingStatus() {
        return chargingStatus;
    }

    //Setter
    public void setChargingStatus(int chargingStatus) {
        this.chargingStatus = chargingStatus;
    }
}
