public class Triangle extends Shape {
    //Instances
    int a;
    int b;
    int c;double x;
    double y;

    /**
     * Constructor
     * @param a
     * @param b
     * @param c
     */
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getArea() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    public String toString(){
        String str = "Triangle, a =" + a + ", b = " + b +", c = "+ c;
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
