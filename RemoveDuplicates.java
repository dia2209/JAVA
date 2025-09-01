//WAP to remove duplicate elements in an array
//Name: Diya Manandhar
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter array:");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; ) {
                if(arr[i] == arr[j]) {
                    for(int k = j; k < n-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    n--;
                } else {
                    j++;
                }
            }
        }

        System.out.println("After removing duplicates:");
        for(int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
