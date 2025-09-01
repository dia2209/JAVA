//ArrayOutOfBoundsException
public class AIOOBEEXC {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        try{
            System.out.println("Number at index 4: "+arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutofBounds: "+e.getMessage());
        }
    }
}
