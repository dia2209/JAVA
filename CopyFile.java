/*WAP to copy the content of one .txt file into another using FileInputStream and FileOutputStream*/
//Name:Diya Manandhar
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("source.txt");
        FileOutputStream fos = new FileOutputStream("copy.txt");

        int byteData;
        while ((byteData = fis.read()) != -1) {
            fos.write(byteData);
        }

        fis.close();
        fos.close();
        System.out.println("File copied successfully.");
    }
}
