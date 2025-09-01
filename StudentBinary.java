/*Write a program to store a student's name (String), roll number (int), and GPA (float) to a binary file using DataOutputStream. 
Then read it back using DataInputStream/*/
//Name:Diya Manandhar
import java.io.*;

public class StudentBinary {
    public static void main(String[] args) throws IOException {
        // Writing
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.dat"));
        dos.writeUTF("Diya");
        dos.writeInt(101);
        dos.writeFloat(3.85f);
        dos.close();

        // Reading
        DataInputStream dis = new DataInputStream(new FileInputStream("student.dat"));
        String name = dis.readUTF();
        int roll = dis.readInt();
        float gpa = dis.readFloat();
        dis.close();

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("GPA: " + gpa);
    }
}
