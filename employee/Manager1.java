package employee;
public class Manager1 extends Employee1{
    public Manager1(String name, int id){
        super(name,id);
    }

    public void display(){
        System.out.println("Manager Details: ");
        super.display();
    }
}