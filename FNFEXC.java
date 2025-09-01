//FileNotFoundException
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class FNFEXC {
    public static void main(String[] args){
        try{
            File file=new File("nonexistentfile.txt");
        FileReader fr=new FileReader(file);
        }
        catch(FileNotFoundException e){
            System.out.println("Caught FileNotFoundException: "+e.getMessage());
        }

}
}
