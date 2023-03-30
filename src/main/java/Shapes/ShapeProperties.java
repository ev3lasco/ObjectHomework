package Shapes;

public class ShapeProperties {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.radius = 15;
        circle1.setDiameter();

        Triangle triangle1 = new Triangle();
        triangle1.height = 10;
        triangle1.base = 10;
        triangle1.calculateArea();

        Square square1 = new Square();
        square1.sides = 10;
        square1.calculateArea();

    }


}
