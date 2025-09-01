public class Prime {
    public static void main(String[] args){
         int num=143;
         boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num %i ==0){
                    isPrime=false;
                    break;
                }
            }
        }
   
    
    if(!isPrime){
        System.out.println("The number is not prime");
    }
    else{
        System.out.println("The number is prime");
    }
    }}
    

