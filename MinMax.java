//Find Min and Max && Name: Diya Manandhar
import java.util.Scanner;

public class MinMax{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];

        System.out.println("The array is: ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println("The maximum is "+ max);
        System.out.println("The minimum is "+min);
    }}