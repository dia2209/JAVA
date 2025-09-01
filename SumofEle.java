//Sum of Elements
//Name: Diya Manandhar
import java.util.Scanner;

public class SumofEle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }

        System.out.println("The sum is "+sum);
    }
}