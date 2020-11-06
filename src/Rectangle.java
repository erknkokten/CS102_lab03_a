public class Rectangle extends Shape{

    //instances
    int width;
    int length;
    int x;
    int y;
    boolean selected;

    /**
     * Constructor
     * @param width
     * @param length
     */
    public Rectangle(int width, int length){
        this.width = width;
        this.length=length;
        selected = false;
        x=0;
        y=0;
    }
    /**
     * returns area
     * @return area
     */
    @Override
    public double getArea() {
        return width*length;
    }
    /**
     * returns perimeter
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    public String toString(){
        String str = "Rectangle, width =" + width + ", length = "+length+ ", Selected: " + getSelected();
        return str;
    }
    /**
     * returns X coordinate
     * @return x coordinate
     */
    @Override
    public double getX() {
        return x;
    }
    /**
     * returns y coordinate
     * @return y coordinate
     */
    @Override
    public double getY() {
        return y;
    }
    /**
     * sets the location of x and y
     * @param x
     * @param y
     */
    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;

    }
    /**
     * chekcs if the shape is selected
     * @return
     */
    @Override
    public boolean getSelected() {
        return selected;
    }
    /**
     * sets the shape as selected
     * @param selected
     */
    @Override
    public void setSelected(boolean selected){
        this.selected = selected;
    }

    /**
     * assume that x and y instances are in middle of the shape
     * @param x
     * @param y
     * @return
     */
    @Override
    public Shape contains( int x, int y){
        if(Math.abs(x-this.x) <= length/2 &&  Math.abs(y-this.y) <= width/2)
            return this;
        //if does not contain
        selected = !selected;
        return this;
    }
}
