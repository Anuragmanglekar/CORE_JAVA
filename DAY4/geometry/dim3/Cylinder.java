package geometry.dim3;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double CalcVolume() {
        return 2 * 3.14 * this.radius * this.height;

    }

}
