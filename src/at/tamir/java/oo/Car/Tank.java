package at.tamir.java.oo.Car;

public class Tank {
    private int fuelConsumption;
    private int fuelAmount;
    private int tankVolume;
    private int remainingRange;

    //Construktor: Tank
    public Tank (int fuelConsumption, int fuelAmount, int tankVolume){
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.tankVolume = tankVolume;
    }

    //Feature: turboBoost
    public void turboBoost() {
        if (this.fuelAmount > this.tankVolume * 0.1) {
            System.out.println("Super Boost Mode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    //Feature: remainingRange
    public void RemainingRange() {
        this.remainingRange = this.fuelAmount / this.fuelConsumption;
        if (this.fuelAmount == 0) {
            System.out.println("Can't drive any further");
        } else {
            System.out.println("You can drive " + this.remainingRange + " times before fuel is out");
        }
    }


    //setter
    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public void setRemainingRange(int remainingRange) {
        this.remainingRange = remainingRange;
    }


    //getter
    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public int getRemainingRange() {
        return remainingRange;
    }
}
