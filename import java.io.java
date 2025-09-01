import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageDuplicate {
    public static void main(String[] args) {
        String sourcePath = "originalImage.jpg";   // Change this to your source image file path
        String destPath = "duplicateImage.jpg";    // Destination duplicate file path

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[1024]; // Buffer to hold bytes read
            
            int bytesRead;

            // Read bytes from source and write to destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image duplicated successfully!");

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}