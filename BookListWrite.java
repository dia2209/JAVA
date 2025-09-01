import java.io.*;
import java.util.*;
public class BookListWrite {
    public static void main(String[] args) throws IOException {
        List<Book1> books = new ArrayList<>();
        books.add(new Book1(1, "Java Basics", "Alice"));
        books.add(new Book1(2, "OOP Concepts", "Bob"));
        books.add(new Book1(3, "File Handling", "Carol"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt"));
        for (Book1 b : books) {
            writer.write(b.toString());
            writer.newLine();
        }
        writer.close();
        System.out.println("Books written to file.");
    }
}
