public class Product {

    private int id;
    private String bottle;
    private double volume;
    private String material;

    public Product() {

    }

    public Product(int id, String bottle, double volume, String material) {
        this.id = id;
        this.bottle = bottle;
        this.volume = volume;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBottle() {
        return bottle;
    }

    public void setBottle(String bottle) {
        this.bottle = bottle;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return  id + " " + bottle + " " + String.format("%.2f", volume) + " " + material + " ";
    }
}
