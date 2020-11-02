import java.lang.Math.*;
public class Circle extends Shape{

    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
    }
}
