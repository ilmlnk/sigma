package serial.dto;

public class Transport {
    protected int velocity;
    protected int productionYear;
    protected Engine engine;

    public Transport() {}

    public Transport(int velocity, int productionYear, Engine engine) {
        this.velocity = velocity;
        this.productionYear = productionYear;
        this.engine = engine;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "velocity=" + velocity +
                ", productionYear=" + productionYear +
                ", engine=" + engine +
                '}';
    }
}
