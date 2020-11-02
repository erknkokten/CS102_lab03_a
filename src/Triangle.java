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
        //KENDİME NOT: EĞİM DÜŞÜNEREK YAPABİLİRSİN.
        if(Math.abs(x-this.x) <= Math.abs(a+b)/2 &&  Math.abs(y-this.y) <= Math.abs(a-c)/2 )
            return this;
        //if does not contain
        selected = !selected;
        return this;
    }
}
