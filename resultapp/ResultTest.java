package resultapp;
import studentinfo.*;

public class ResultTest{
    public static void main(String[] args){
        Student5 s=new Student5("Diya",100);
        Marks m=new Marks(70,80,90);
        Result r=new Result(s,m);
        r.display();
    }
}