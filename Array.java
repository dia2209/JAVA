import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Asking for array size
        System.out.print("Enter the size of the array:");
        int size=input.nextInt();

        //Declaring and initializing the array
        int[] array= new int[size];
        
        //Inputting the values into the array
        System.out.print("Enter " + size +" elements:");
        for(int i=0;i<size;i++){
            array[i]=input.nextInt();
        }
        //Printing the array
        System.out.println("The array is: ");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+ " ");
        }

        //Checking the greatest and the least
        int greatest,least;
        greatest=least=array[0];
        for(int i=0;i<size;i++){
            if(greatest<array[i]){
                greatest=array[i];
            }
            if(least>array[i]){
                least=array[i];
            }
        }
        System.out.println("\nThe greatest element is "+greatest);
        System.out.println("The least element is "+least);
        
        //Target Element
        System.out.println("Enter the target element: ");
        int target=input.nextInt();
        boolean found=false;

        for(int i=0;i<size;i++){
            if(target==array[i]){
               found=true;
               break;
                
            }
        }

        if(found){
                System.out.println("The target element "+ target+" has been found");
                
            }
            else{
                System.out.println("The target element "+target+" is not present in the array");
            }

    }
}
