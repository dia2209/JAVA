/*Design a package employee with classes Employee, Manager, andClerk. Use
inheritance and access them from a different package.*/
//Name:Diya Manandhar
package employee;
public class Employee1{
    public String name;
    public int id;

    public Employee1(String name, int id){
        this.name=name;
        this.id=id;
    }

    public void display(){
        System.out.println("Name: " + name + ",ID: "+id);
    }
}