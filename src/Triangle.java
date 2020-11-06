public class Triangle extends Shape {
    //Instances
    int a;
    int b;
    int c;int x;
    int y;
    boolean selected;
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
        selected = false;
        x=0;
        y=0;
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
        String str = "Triangle, a =" + a + ", b = " + b +", c = "+ c+ ", Selected: " + getSelected();
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

        double top_x = (Math.pow(c,2) - Math.pow(b,2))/(-2*a);
        double top_y = Math.sqrt(Math.pow(c,2)-Math.pow((top_x-(double)a/2),2));
        double slope1 = top_y/(top_x-(double)a/2), slope2 = top_y/(top_x+(double)a/2);

        double bigger, smaller;
        if(slope1 < slope2) {
            bigger = slope2;
            smaller = slope1;
        }
        else{
            bigger = slope1;
            smaller = slope2;
        }

        double slope = (top_y - y)/(top_x - x);
        if(x <= (double)a/2 && x>= -(double)a/2 && y <= top_y && y >= 0 ){
            if((slope > 0 && slope >= bigger)||(slope < 0 && slope <= smaller)){
                return this;
            }
            else{
                selected = !selected;
                return this;
            }
        }
        selected = !selected;
        return this;

    }
}
