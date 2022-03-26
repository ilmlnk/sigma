package serial.dto;

public class Wheel {
    private int load;
    private int diameter;

    public Wheel(int load, int diameter) {
        this.load = load;
        this.diameter = diameter;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "load=" + load +
                ", diameter=" + diameter +
                '}';
    }
}
