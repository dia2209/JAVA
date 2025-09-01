/*Question 3: 
Write a class Student with variables int id and String name.
Create a constructor with parameters having the same names and use 'this' to assign them.
Add a display() method to print the values.*/
public class Student1{
    int id;
    String name;

    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
    }
}
