import java.util.ArrayList;

public class ShapeContainer {

    //Instances
    ArrayList<Shape> shapes ;

    public ShapeContainer(){

        shapes  = new ArrayList<Shape>();
    }

    public void add( Shape s){
        shapes.add(s);
    }

    /**
     * Returns the sum of areas of the shapes it hold
     * @return
     */
    public double getArea(){
        double area = 0;
        for(int i=0;i< shapes.size();i++){
            area = area + shapes.get(i).getArea();
        }
        return area;
    }

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
            str = str + "\n" + shapes.get(i).toString();
        }
        return str;
    }
}
