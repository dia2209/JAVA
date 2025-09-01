//Write a Java program that reads an image file and creates a duplicate file using FileInputStream and FileOutputStream
import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class q2{
    public static void main(String[] args){
        try(FileInputStream in= new FileInputStream("abc.jpg");
        FileOutputStream out= new FileOutputStream("newimg.jpg");){
            
        int Databytes;
        while(Databytes=in.read()!=-1){
            out.write(Databytes);
        }

        System.out.println("Image copied successfully");

        }

        else(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
