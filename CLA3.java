//Name: Diya Manandhar
//3. Check Even or Odd using command line arguments
public class CLA3 {
    public static void main(String[] args){
        int i=0;
        while(i < args.length){
            int number= Integer.parseInt(args[i]);
            i++;
            if(number%2==0){
                System.out.println("The number " + number + " is even");
            }
            else{
                System.out.println("The number " + number + " is odd");
            }
        }
    }
}
