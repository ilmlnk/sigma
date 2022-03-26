package serial.dto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ship extends Transport implements Externalizable {
    private int waterWeight;
    private double length;
    private Boat boat;

    public Ship() {}

    public Ship(int velocity, int productionYear, Engine engine,
                int waterWeight, double length, Boat boat) {
        super(velocity, productionYear, engine);

        this.waterWeight = waterWeight;
        this.length = length;
        this.boat = boat;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(waterWeight);
        out.writeDouble(length);
        out.writeObject(boat);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.waterWeight = in.readInt();
        this.length = in.readDouble();
        this.boat = (Boat) in.readObject();
    }

    public int getWaterWeight() {
        return waterWeight;
    }

    public void setWaterWeight(int waterWeight) {
        this.waterWeight = waterWeight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "waterWeight=" + waterWeight +
                ", length=" + length +
                ", boat=" + boat +
                ", velocity=" + velocity +
                ", productionYear=" + productionYear +
                ", engine=" + engine +
                '}';
    }
}
