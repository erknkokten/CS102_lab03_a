public class Square extends Rectangle {
    
    int side;
    int x;
    int y;
    boolean selected;
    /**
     * Constructor
     * @param side
     */
    public Square(int side) {
        super(side, side);
        this.side = side;
        selected = false;
        x=0;
        y=0;
    }

    /**
     * returns area
     * @return area
     */
    public double getArea(){
        return side*side;
    }

    public String toString(){
        String str = "Square, sides =" + side+ ", Selected: " + getSelected();
        return str;
    }

    /**
     * returns x coord.
     * @return x
     */
    @Override
    public double getX() {
        return x;
    }

    /**
     * returns y coord.
     * @return y
     */
    @Override
    public double getY() {
        return y;
    }

    /**
     * sets the location of the shape
     * @param x
     * @param y
     */
    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;

    }

    /**
     * checks if selected situation
     * @return
     */
    @Override
    public boolean getSelected() {
        return selected;
    }

    /**
     * sets as selected
     * @param selected
     */
    @Override
    public void setSelected(boolean selected){
        this.selected = selected;
    }

    /**
     * assume that x and y instances are in middle of the shape
     * @param x coord.
     * @param y coord.
     * @return shape
     */
    @Override
    public Shape contains( int x, int y){
        if(Math.abs(x-this.x) <= side/2 &&  Math.abs(y-this.y) <= side/2)
            return this;
        //if does not contain
        selected = !selected;
        return this;
    }

}
