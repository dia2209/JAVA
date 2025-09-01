//Reverse Array
//Name:Diya Manandhar
import java.util.Scanner;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("The original array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.print("\nThe reversed array is:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}