///Name: Diya Manandhar
//4. WAP that takes a string as a command line argument and prints the reversed string
public class CLA4 {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("No string is given");
            return;
        }

        String original=args[0];//It takes only one string
        System.out.println("The original string is " + original);
        String reversed="";
        for(int i=original.length() -1; i>=0; i--){
            reversed+=original.charAt(i);
        }

        System.out.println("The reversed string is "+ reversed);
    }
}


