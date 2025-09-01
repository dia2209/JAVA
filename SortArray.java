//WAP to sort an array in ascending and descending order && Name: Diya Manandhar
import java.util.Scanner;
public class SortArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.print("Enter the size: ");
        int n=sc.nextInt();

        System.out.print("\nEnter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Ascending Order:
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.print("Ascending: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nDescending: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
}
}