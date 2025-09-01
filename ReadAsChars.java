/* WAP that reads a file and prints its content as characters, even though it's read in bytes.*/
//Name:Diya Manandhar
import java.io.*;

public class ReadAsChars {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("source.txt");

        int byteData;
        while ((byteData = fis.read()) != -1) {
            System.out.print((char) byteData); // cast byte to character
        }

        fis.close();
    }
}
