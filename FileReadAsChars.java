import java.io.FileInputStream;
import java.io.IOException;

public class FileReadAsChars {
    public static void main(String[] args) {
        String filePath = "input.txt";  // Change this to your file path

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;

            // Read one byte at a time until EOF (-1)
            while ((byteData = fis.read()) != -1) {
                // Convert byte to char and print
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

