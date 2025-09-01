/*Write a class Calculator with overloaded methods named add():
i) One adds two integers.
ii) One adds two doubles.
iii) One adds three integers.*/
//Name:Diya Manandhar

public class Calculatorr{
    public static void main(String[] args){
        Calculatorr calc=new Calculatorr();

        calc.add(2,3);
        calc.add(2,3,4);
        calc.add(2.5,3.5);
    }

    public void add(int a, int b){
        System.out.println("Sum of two integers: "+(a+b));
        }
    public void add(int a, int b, int c){
        System.out.println("Sum of three integers: "+(a+b+c));
        }
    public void add(double a, double b){
        System.out.println("Sum of two doubles: "+(a+b));
        }
}