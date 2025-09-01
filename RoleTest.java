public class RoleTest{
    public static void main(String[] args){
        Personn p;

        p = new Personn();
        p.hierarchy();  

        p = new Employeeee();
        p.hierarchy(); 
        p = new Manager();
        p.hierarchy();
    }
}