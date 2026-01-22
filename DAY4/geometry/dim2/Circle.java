package geometry.dim2;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double CalcArea() {
        return 3.14 * this.radius * this.radius;
    }

}