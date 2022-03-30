package collections.dto;

public class Line {
    private int k;
    private int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Line(" +
                "k=" + k +
                ", b=" + b +
                ')';
    }
}
