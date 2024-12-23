package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Circle extends Shape {



    public final double radius;
    public Circle(double radius) {

        this.radius = radius;

    }

    @Override
    public double getArea() {

        return Math.PI * radius * radius;
    }



}
