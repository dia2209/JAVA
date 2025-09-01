import java.io.*;
public class EmptyFileCheck {
    public static void main(String[] args) {
        File file = new File("check.txt");

        try {
            if (!file.exists()) {
                System.out.println("File does not exist.");
                return;
            }

            if (file.length() == 0) {
                throw new EmptyFileException("The file is empty!");
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (EmptyFileException e) {
            System.out.println("Custom Exception: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}




