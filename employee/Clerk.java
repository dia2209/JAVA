package employee;
public class Clerk extends Employee1{
    public Clerk(String name, int id){
        super(name,id);
    }

    public void display(){
        System.out.println("Clerk Details:");
        super.display();
    }
}