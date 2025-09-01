public class Calculator{
    public static void main(String[] args){
        int x=1;
        int y=2;
        add(x,y);
        subtract(x,y);
        multiply(x,y);
        divide(x,y);
        remainder(x,y);
    }
    static void add(int a, int b){
        int sum=a+b;
        System.out.println(sum);
    }
    static void subtract(int a,int b){
        int subtract=a-b;
        System.out.println(subtract);
    }
    static void multiply(int a,int b){
        int multiply=a*b;
        System.out.println(multiply);
    }
    static void divide(int a,int b){
        int divide=a/b;
        System.out.println(divide);
    }
    static void remainder(int a,int b){
        int remainder=a%b;
        System.out.println(remainder);
    }
}