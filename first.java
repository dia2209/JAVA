public class first//yo it must be same as the file name// separate functions
{
    public static void main(String[] args){
        //System.out.println("Hello ACE");
        int x=8;
        int y=2;
        add(x,y);
        subtract(x, y);
        division(x,y);
        multiply(x,y);
        remainder(x,y);
    }
    static void add(int a, int b){
            int sum=a+b;//student ki class  5 ita attributes and cnstructir 
            System.out.println(sum);
    }
    static void subtract(int a, int b){
        int sub=a-b;
        System.out.println(sub);
    }
    static void division(int a, int b){
        int div=a/b;
        System.out.println(div);
    }
    static void multiply(int a, int b){
        int mul=a*b;
        System.out.println(mul);
    }
    static void remainder(int a, int b){
        int rem=a%b;
        System.out.println(rem);
    }
}