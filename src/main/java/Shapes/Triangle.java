package Shapes;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Треугольник нарисован");
    }

    @Override
    public void calculateSmth() {
        System.out.println("Треугольник расчитывается");
    }

    @Override
    public void erase() {
        System.out.println("Треугольник стёрт");
    }

    @Override
    public void paint() {
        System.out.println("Треугольник раскрашен");
    }
}
