package shapeapp;
import shape.Circle1;
import shape.Rectangle1;
import shape.Triangle1;
public class MainShape{
    public static void main(String[] args){
        Circle1 c=new Circle1(5);
        Rectangle1 r=new Rectangle1(4,6);
        Triangle1 t=new Triangle1(3,4,5);

        System.out.println("Circle Area: "+c.area());
        System.out.println("Rectangle Perimeter: "+r.perimeter());
        System.out.println("Triangle Area: "+t.area());
    }
}