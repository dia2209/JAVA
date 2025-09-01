import java.io.*;
public class EmployeeSerialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee1 emp = new Employee1(1, "Diya", 50000);

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        oos.writeObject(emp);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee1 e = (Employee1) ois.readObject();
        ois.close();

        System.out.println("ID: " + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
    }
}
