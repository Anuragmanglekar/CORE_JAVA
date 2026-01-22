package geometry;

import geometry.dim1.*;
import geometry.dim2.*;
import geometry.dim3.*;

public class demo {
    public static void main(String[] args) {
        box b = new box(3.1, 4.1, 5.1);
        System.out.println("Area of box:"+b.CalcVolume());
        Circle c = new Circle(3.1);
        System.out.println("Area of circle:"+c.CalcArea());
        Cylinder cy = new Cylinder(3.1, 4.1);
        System.out.println("Area of Cylinder:"+cy.CalcVolume());


    }

}
