package Shapes;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Квадрат нарисован");
    }

    @Override
    public void calculateSmth() {
        System.out.println("Расчеты производятся");
    }

    @Override
    public void erase() {
        System.out.println("Квадрат стёрт");
    }

    @Override
    public void paint() {
        System.out.println("Квадрат покрашен");
    }
}
