package Shapes;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Круг нарисован");
    }

    @Override
    public void calculateSmth() {
        System.out.println("Что-то расчитывается");
    }

    @Override
    public void erase() {
        System.out.println("Круг стёрт");
    }

    @Override
    public void paint() {
        System.out.println("Круг раскрашен");
    }
}
