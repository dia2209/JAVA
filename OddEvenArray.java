//Count how many odd and even number exists in array
//Name: Diya Manandhar
import java.util.Scanner;
public class OddEvenArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[100];
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int EvenCount=0;
        int OddCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                EvenCount++;
            }
            if(arr[i]%2!=0){
                OddCount++;
            }
        }

        System.out.println("The number of odd elements is "+OddCount);
        System.out.println("The number of even elements is "+EvenCount);
    }
}