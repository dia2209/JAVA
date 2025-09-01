//Name: Diya Manandhar
//5. WAP that takes multiple numeric arguments and finds the largest number among them.
public class CLA5 {
    public static void main(String[] args){
        if(args.length==0){
            System.out.println("No numbers have been provided");
            return;
        }
        
        int greatest= Integer.parseInt(args[0]);

          for(int i=0; i<args.length;i++){
            int number= Integer.parseInt(args[i]);
           
            if(number > greatest){
                greatest=number;
            }
          }
          System.out.println("The greatest number is " + greatest);
         
    }
}
