/* Create a package shape with classes Circle, Rectangle, and Triangle. Each class should
have methods to calculate area and perimeter. Test the classes in another package.*/
//Name:Diya Manandhar
package shape;
public class Circle1{
    double radius;

    public Circle1(double r){
        radius=r;
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimteter(){
        return 2*Math.PI*radius;
    }
}
