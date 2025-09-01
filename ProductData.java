/*Write a program that takes product data (productId, price, quantity) from the user and writes it using DataOutputStream. 
Later, read the file and compute the total cost per product.*/
//Name:Diya Manandhar
import java.io.*;
import java.util.*;

public class ProductData {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("product.dat"));

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter price: ");
        float price = sc.nextFloat();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        dos.writeInt(id);
        dos.writeFloat(price);
        dos.writeInt(qty);
        dos.close();

        // Reading and computing total cost
        DataInputStream dis = new DataInputStream(new FileInputStream("product.dat"));
        int pid = dis.readInt();
        float pr = dis.readFloat();
        int quantity = dis.readInt();
        dis.close();

        float totalCost = pr * quantity;
        System.out.println("Total cost for product ID " + pid + ": " + totalCost);
    }
}
