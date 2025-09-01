/*Write a Java program that reads an image file (.jpg) and creates a duplicate file using FileInputStream and FileOutputStream.*/
//Name:Diya Manandhar
import java.io.*;

public class CopyImage {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("testo.jpg");
        FileOutputStream fos = new FileOutputStream("duplicate.jpg");

        int byteData;
        while ((byteData = fis.read()) != -1) {
            fos.write(byteData);
        }

        fis.close();
        fos.close();
        System.out.println("Image copied successfully.");
    }
}
