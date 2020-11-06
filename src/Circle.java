import java.lang.Math.*;
public class Circle extends Shape{

    int radius;
    int x;
    int y;
    boolean selected;
    //constructor
    public Circle(int radius){
        this.radius = radius;
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
        return Math.PI * radius * radius;
    }

    /**
     * returns perimeter
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
    }

    public String toString(){
        String str = "Circle, radius =" + radius+ ", Selected: " + getSelected();
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
        if(Math.sqrt(Math.pow(x-this.x,2) + Math.pow(y-this.y,2)) <= radius)
            return this;
        //if does not contain
        selected = !selected;
        return this;
    }

}
