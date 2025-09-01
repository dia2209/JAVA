/*Define a class Employee with fields id, name, and salary. Write a program to serialize an
object of this class and store it into a file. Then deserialize it and print the object data.*/
//Name:Diya Manandhar
import java.io.*;
class Employee1 implements Serializable {
    int id;
    String name;
    double salary;

    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
