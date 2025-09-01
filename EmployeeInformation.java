public class EmployeeInformation{
    public static void main(String[] args){
        Employee emp=new Employee(1,"Diya","Manager",1000000);
        emp.display();
        System.out.println("Annual Salary: "+emp.calculateAnnualSalary());
    }
}