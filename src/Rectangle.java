public class Rectangle extends Shape{

    //instances
    int width;
    int length;

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
}
