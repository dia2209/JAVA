public class Book implements Read,Write{
     @Override
     public void read(){
        System.out.println("Reading...");
     }

     @Override
     public void write(){
        System.out.println("Writing...");
     }
}