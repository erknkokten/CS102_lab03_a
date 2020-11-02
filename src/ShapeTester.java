import java.util.Scanner;
public class ShapeTester {
    public static void main(String args[]){
        final String menu = "1- Create an empty set of Shapes\n" +
                "2- Add a shape to array\n" +
                "3- Print out the total perimeter and area of the shapes in ShapeContainer\n" +
                "4- Print shapes' information\n" +
                "5- Find the first Shape that contains a given x, y point and toggle its selected state\n" +
                "6- Removes all selected shapes";

        ShapeContainer shapes = null;
        Scanner scan = new Scanner(System.in);
        int selection;
        do{
            System.out.println(menu);
            selection = scan.nextInt();
            if(selection == 1){
                shapes = new ShapeContainer();
            }
            else if(selection == 2){
                System.out.println("Choose a shape:\n1- Circle\n2- Rectangle\n3- Square\n4-Triangle");
                    int shape_choice = scan.nextInt();
                    if(shape_choice==1){
                        System.out.println("Enter radius:");
                        int radius = scan.nextInt();
                        shapes.add(new Circle(radius));
                    }
                    else if(shape_choice==2){
                        System.out.println("Enter length:");
                        int length = scan.nextInt();
                        System.out.println("Enter width:");
                        int width = scan.nextInt();
                        shapes.add(new Rectangle(width, length));
                    }
                    else if(shape_choice==3){
                        System.out.println("Enter side:");
                        int side = scan.nextInt();
                        shapes.add(new Square(side));
                    }
                    else if(shape_choice==4){
                        System.out.println("Enter a:");
                        int a = scan.nextInt();
                        System.out.println("Enter b:");
                        int b = scan.nextInt();
                        System.out.println("Enter c:");
                        int c = scan.nextInt();
                        shapes.add(new Triangle(a,b,c));

                }


            }
            else if(selection == 3){
                System.out.println("Total area = " + shapes.getArea() +"\nTotal perimeter = " + shapes.getPerimeter());

            }
            else if(selection == 4){
                System.out.println(shapes.toString());
            }
            else if(selection == 5){
                System.out.println("Select points x and y.\n X:");
                int x = scan.nextInt();
                System.out.println("Y:");
                int y = scan.nextInt();

                shapes.toggleSelected(x,y);

            }
            else if(selection == 6){
                shapes.removeSelected();
            }
        }while(selection != 0);
    }
}
