package mainapp;

import mathutils.Calculator2;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();

        System.out.println("Add: " + calc.addition(5, 3));
        System.out.println("Subtract: " + calc.subtraction(5, 3));
        System.out.println("Multiply: " + calc.multiplication(5, 3));
        System.out.println("Divide: " + calc.division(5, 3));
    }
}
