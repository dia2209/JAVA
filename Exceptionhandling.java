//checked exception-compile time
//unchecked exception-runtime
import java.util.Scanner;
public class Exceptionhandling{
    public static void main(String[] args){
       
       
        try{
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str=obj.nextLine();

        Integer.parseInt(str);
        System.out.println("The input is "+str);}
        
        catch(Exception e){
            System.out.println("Wrong input");
        }
    }
}