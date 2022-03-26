package serial.dto;

public class Chassis {
    private Wheel wheel;
    private int wheelAmount;

    public Chassis(Wheel wheel, int wheelAmount) {
        this.wheel = wheel;
        this.wheelAmount = wheelAmount;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "wheel=" + wheel +
                ", wheelAmount=" + wheelAmount +
                '}';
    }
}
