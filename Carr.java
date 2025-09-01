/*Create a Car class with attributes like model, price, and mileage. Write a method to
compare mileage of two car objects and display the better one.*/
//Name: Diya Manandhar

public class Carr{
    String model;
    int price;
    int mileage;

    public Carr(String model,int price,int mileage){
        this.model=model;
        this.price=price;
        this.mileage=mileage;
    }

    public void displayDetails(){
        System.out.println("Model: "+ model +",Price: "+ price +",Mileage: "+ mileage);
    }

}



    

