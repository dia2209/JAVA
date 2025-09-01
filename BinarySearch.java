//Binary Search
//Name: Diya Manandhar
import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter sorted array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }

        System.out.println("Enter element to search: ");
        int key=sc.nextInt();

        int low=0, high=n-1;
        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element found at index "+mid);
                found=true;
                break;
            }
           else if(arr[mid]<key){
            low=mid+1;
           }
           else{
            high=mid-1;
           }
        }

        if(!found){
            System.out.println("Not found");
        }
    }
}