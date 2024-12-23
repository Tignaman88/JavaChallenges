package CodeWars;

public class Rectangle extends Shape {


    public final double width;
    public final double length;
    public Rectangle(double width, double length) {

        this.width = width;
        this.length = length;

    }

    @Override
    public double getArea() {

        return width * length;
    }
}
