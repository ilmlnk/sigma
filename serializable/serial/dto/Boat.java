package serial.dto;

import java.io.Serializable;

public class Boat implements Serializable {
    private int passengerAmount;
    private String material;

    public Boat(int passengerAmount, String material) {
        this.passengerAmount = passengerAmount;
        this.material = material;
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public void setPassengerAmount(int passengerAmount) {
        this.passengerAmount = passengerAmount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "passengerAmount=" + passengerAmount +
                ", material='" + material + '\'' +
                '}';
    }
}
