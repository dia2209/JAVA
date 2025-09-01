import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyWithStreams {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            // Open input file for reading
            FileInputStream inputStream = new FileInputStream(inputFile);
            
            // Open output file for writing
            FileOutputStream outputStream = new FileOutputStream(outputFile);
        ) {
            // Buffer to hold data
            byte[] buffer = new byte[1024]; // 1 KB buffer
            int bytesRead;

            // Read from input and write to output
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully using streams!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
