//1. WAP that takes command line arguments and prints each argument on a new line.
public class Assignment{
    public static void main(String[] args){
         int i=0;
         if(args.length > 0){
            while(i < args.length){
            System.out.println(args[i]);
            i++;
         }}
         else{
            System.out.println("No arguments passed.");
         }
    }
}

