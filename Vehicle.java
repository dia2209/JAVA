/*Question 2: 
Scenario: You're creating a vehicle app with a base class Vehicle and subclass Car.
Task:
    a)Create a class Vehicle with a method void start().
    b)Create a subclass Car with a method void playMusic().
    c)In main(), do the following:
        i)Create a Car object and upcast it to a Vehicle reference.
        ii)Downcast it back to Car and call playMusic().
        iii)Try to downcast a plain Vehicle object to Car and observe what happens.*/

public class Vehicle{
    void start(){
        System.out.println("The vehicle is starting");
    }
}


