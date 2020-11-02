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

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    public String toString(){
        String str = "Rectangle, width =" + width + ", length = "+length+ ", Selected: " + getSelected();
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
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public boolean getSelected() {
        return selected;
    }
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
