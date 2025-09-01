//NumberFormatException
public class NFEEXC {
    public static void main(String[] args){
        String invalidNo="abc123";
        try{
            int num=Integer.parseInt(invalidNo);
            System.out.println("Number: "+num);
        }
        catch(NumberFormatException e){
            System.out.println("Caught NumberFormatException: "+e.getMessage());
        }
    }
}
