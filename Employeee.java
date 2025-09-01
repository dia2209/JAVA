/*Create a class Employee with attributes like id, name, designation, and salary. Include
Constructors to initialize data and methods to display details, and calculate annual
salary*/

public class Employeee{
    int id;
    String name;
    String designation;
    int salary;

    public Employeee(int id, String name, String designation, int salary){
        this.id=id;
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    
    public void display(){
    System.out.println("Id: "+ id);
    System.out.println("Name: "+ name);
    System.out.println("Designation: "+ designation);
    System.out.println("Salary: "+ salary);
   }

   public int calculateAnnualSalary(){
    return salary*12;
   }
}