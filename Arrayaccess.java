import java.util.Scanner;

public class Arrayaccess{
    public static void main(String[] args){


        try{
            Scanner input=new Scanner(System.in);
 
        System.out.print("Enter the size of the array:");
        int size=input.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter "+size+" elements");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }

        System.out.print("Enter the index: ");
        int index=input.nextInt();
        } 
        catch (Exception e) {
            System.out.println("message");
        }
        

    }
}