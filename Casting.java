public class Casting {
    public static void main(String[] args){
        //Upcasting
        Vehicle v=new Car();//Car obj=new Car(); Vehicle v=obj;
       
        //Downcasting it back to car
        Car c=(Car)v;
        c.playMusic();

        //Downcasting a plain Vehicle object
        Vehicle object=new Vehicle();
        Car dc=(Car)object;/*Exception in thread "main" java.lang.ClassCastException*/
    }
}
