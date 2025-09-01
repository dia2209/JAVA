//NullPointerException
public class NPE {
    public static void main(String[] args) {
        String name=null;
        try{
            System.out.println("Length is: "+name.length());
        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointerException: "+e.getMessage());
        }
    }
}
