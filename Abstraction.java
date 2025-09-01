public class Abstraction{
    public static void main(String[] args){
        Vehicle1 v1=new Car1();
        v1.start();
        Vehicle1 v2=new Bike1();
        v2.start();
    }
}