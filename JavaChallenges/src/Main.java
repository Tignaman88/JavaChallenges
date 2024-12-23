import CodeWars.*;
import CodeWars.Circle;
import CodeWars.Rectangle;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = List.of(new Circle(2), new Rectangle(3,3), new Square(2));
        double totalArea = ShapeUtilities.sumAllAreas(shapes); // 25.567

        List<Circle> circles = List.of(new Circle(2), new Circle(1), new Circle(5));
        double circleArea = ShapeUtilities.sumAllAreas(circles); // compilation error !

        List<Square> squares = List.of(new Square(5), new Square(3), new Square(7));
        double squareArea = ShapeUtilities.sumAllAreas(squares);
    }
}
