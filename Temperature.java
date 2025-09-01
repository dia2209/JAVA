/*Question 1: 
Scenario: You get an integer temperature from a sensor and want to display it as a float.
Question:
Given int temp = 27;
    a)Convert it to double (implicit casting).
    b)Add 0.75 and store the result as float (explicit casting).*/

public class Temperature{
    public static void main(String[] args){
        int temp=27;
        
        double temperature=temp;//implicit
        System.out.println(temp);
        System.out.println(temperature);
        temperature+=0.75;

        float tempo=(float)temperature;//explicit
        System.out.println(tempo);
        
    }
}