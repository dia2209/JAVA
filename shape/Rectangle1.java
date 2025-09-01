package shape;
public class Rectangle1{
    double length,breadth;
    public Rectangle1(double l,double b){
        length=l;
        breadth=b;
    }


    public double area(){
        return length*breadth;
    }

    public double perimeter(){
        return 2*(length+breadth);
    }
}