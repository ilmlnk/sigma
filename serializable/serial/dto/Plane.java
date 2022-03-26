package serial.dto;

import java.io.Serializable;

public class Plane extends Transport implements Serializable {
    private String model;
    private int flyingRange;
    transient private Chassis chassis;

    public Plane() {}

    public Plane(int velocity, int productionYear, Engine engine,
                 String model, int flyingRange, Chassis chassis) {
        super(velocity, productionYear, engine);
        this.model = model;
        this.flyingRange = flyingRange;
        this.chassis = chassis;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFlyingRange() {
        return flyingRange;
    }

    public void setFlyingRange(int flyingRange) {
        this.flyingRange = flyingRange;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", flyingRange=" + flyingRange +
                ", chassis=" + chassis +
                ", velocity=" + velocity +
                ", productionYear=" + productionYear +
                ", engine=" + engine +
                '}';
    }
}
