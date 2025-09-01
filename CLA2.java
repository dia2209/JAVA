//Name: Diya Manandhar
//2. WAP that takes integer command line arguments and calculates their sum.
public class CLA2{
    public static void main(String[] args){
        int sum=0;
        for(int i=0; i< args.length; i++){
           sum+= Integer.parseInt(args[i]);
        }
        System.out.println("The sum is " + sum);
    }
}