public class Square extends Rectangle {
    
    int side;
    double x;
    double y;
    
    /**
     * Constructor
     * @param side
     */
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }

    public String toString(){
        String str = "Square, sides =" + side;
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
