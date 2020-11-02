public class Rectangle extends Shape{

    //instances
    int width;
    int length;
    double x;
    double y;

    /**
     * Constructor
     * @param width
     * @param length
     */
    public Rectangle(int width, int length){
        this.width = width;
        this.length=length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    public String toString(){
        String str = "Rectangle, width =" + width + ", length = "+length;
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
