//Linear Search
//Name: Diya Manandhar
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        System.out.println("Enter array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter an element to search: ");
        int key = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.printf("The element is found at index %d\n", i);
                return; // or we may use break if you want to continue after finding
            }
        }

        System.out.println("The element was not found.");
    }
}

