import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // These are the input and output file paths
        String inputFile = "input.txt";      // file to read from
        String outputFile = "output.txt";    // file to write to

        try (
            // We open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            
            // We open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        ) {
            String line;
            
            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();  // Write a new line after each line
            }
            
            System.out.println("File has been copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
