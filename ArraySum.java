/*Question 5
Write a Java program that:
    a)Takes an integer array as input.
    b)Finds and prints the sum of all even numbers in the array.*/

import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        
        System.out.println("Enter "+size+ " elements");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("The integer array is: ");
        for(int i=0;i<size;i++){
            System.out.println(array[i]+" ");
        }

        int sum=0;
        for(int i=0;i<size;i++){
            if(array[i]%2==0){
                sum+=array[i];
            }
        }
        System.out.println("The sum is "+sum);
        sc.close();
    }

}