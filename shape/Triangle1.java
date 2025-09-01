package shape;
public class Triangle1{
    double a,b,c;
    public Triangle1(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double perimeter(){
        return a+b+c;
    }

    public double area(){
        double s=perimeter()/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}