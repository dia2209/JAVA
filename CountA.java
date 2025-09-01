/*Write a program that reads a text file byte by byte and counts how many times the letter 'a' appears.*/
//Name:Diya Manandhar
import java.io.*;

public class CountA {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("source.txt");

        int count = 0, ch;
        while ((ch = fis.read()) != -1) {
            if ((char) ch == 'a' || (char) ch == 'A') {
                count++;
            }
        }

        fis.close();
        System.out.println("Number of 'a' characters: " + count);
    }
}
