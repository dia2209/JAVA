/*Question 4: 
In the Student class:
    a)Create a no-arg constructor that calls the above constructor using this() with default values.
    b)Print the values from both constructors.*/

public class Student2{
    int id;
    String name;

    Student2(int id, String name){
        this.id=id;
        this.name=name;
    }

    Student2(){
        this(0,"Default Name");
    }

    void display(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
    }
}

