import java.lang.Math.*;
public class Circle extends Shape{

    int radius;
    double x;
    double y;

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

    public String toString(){
        String str = "Circle, radius =" + radius;
        return str;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;

    }
}
