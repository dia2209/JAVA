/*WAP that takes two numbers and performs division. Handle divide-by-zero using exception handling.*/
//Name:Diya Manandhar
import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;  // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero. Error: " + e.getMessage());
        }

        sc.close();
    }
}
