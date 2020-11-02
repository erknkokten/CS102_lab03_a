public class Square extends Rectangle {
    
    int side;
    
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

}
