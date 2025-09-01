public class Comparison{
  public static void main(String[] args) {
        Carr c1 = new Carr("Suzuki", 1500000, 18);
        Carr c2 = new Carr("Hyundai", 1600000, 21);

        c1.displayDetails();
        c2.displayDetails();

        compareMileage(c1, c2);  // compare both
    }

     public static void compareMileage(Carr car1,Carr car2){
        if(car1.mileage>car2.mileage){
            System.out.println(car1.model+" has better mileage.");
        }
        else if(car1.mileage<car2.mileage){
            System.out.println(car2.model+" has better mileage.");
        }
        else{
            System.out.println("Both cars have the same mileage.");
        }
    }
    
}

  