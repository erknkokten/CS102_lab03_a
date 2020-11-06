import java.util.ArrayList;

public class ShapeContainer {

    //Instances
    ArrayList<Shape> shapes ;
    //constructor
    public ShapeContainer(){

        shapes  = new ArrayList<Shape>();
    }
    /**
     * adds shape
     * @param s shape
     */
    public void add( Shape s){
        shapes.add(s);
    }

    /**
     * Returns the sum of areas of the shapes it hold
     * @return area
     */
    public double getArea(){
        double area = 0;
        for(int i=0;i< shapes.size();i++){
            area = area + shapes.get(i).getArea();
        }
        return area;
    }
    /**
     * Returns the sum of perimeters of the shapes it hold
     * @return perimeter
     */
    public double getPerimeter(){
        double perimeter = 0;
        for(int i=0;i< shapes.size();i++){
            perimeter = perimeter + shapes.get(i).getPerimeter();
        }
        return perimeter;
    }

    public String toString(){
        String str = "";
        for(int i=0;i< shapes.size();i++){
            if(shapes.get(i) != null)
                str = str + "\n" + shapes.get(i).toString();
        }
        return str;
    }

    /**
     * Toggles selected if x and y are inside the shape
     * @param x coord.
     * @param y coord.
     */
    public void toggleSelected(int x, int y){
        Shape shape;
        for(int i=0;i< shapes.size();i++){
            shape = shapes.get(i).contains(x,y);
            shape.setSelected(!shape.getSelected());
            shapes.set(i, shape);
        }
    }

    /**
     * deletes selected shapes in the shape container
     */
    public void removeSelected(){
        for(int i=0;i< shapes.size();i++){

            if(shapes.get(i).getSelected()){
                shapes.remove(i);
                i--;
            }

        }
    }
}
