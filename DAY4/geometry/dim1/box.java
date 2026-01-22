package geometry.dim1;

public class box {
    private double length;
    private double breadth;
    private double height;

    public box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double CalcVolume() {
        return this.length * this.breadth * this.height;

    }

}
