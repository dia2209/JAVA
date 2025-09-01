package office;
import employee.*;
public class TestEmployee{
    public static void main(String[] args){
        Manager1 m=new Manager1("Diya",1);
        Clerk c=new Clerk("Sam",2);
        m.display();
        c.display();
    }
}