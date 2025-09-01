/*Create a package mathutils with a class Calculator that performs basic operations:
addition, subtraction, multiplication, and division. Use it in a main class from another
package.*/
package mathutils;

public class Calculator1 {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0; // return something even if division not possible
        }
    }
}
