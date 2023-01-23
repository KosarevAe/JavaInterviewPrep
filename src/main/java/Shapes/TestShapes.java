package Shapes;

public class TestShapes {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        circle.draw();
        circle.paint();
        circle.erase();

        System.out.println("-------------------------------------------");

        square.draw();
        square.paint();
        square.erase();

        System.out.println("-------------------------------------------");

        triangle.draw();
        triangle.paint();
        triangle.erase();
    }
}
