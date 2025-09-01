public class Bank {
    private int balance;
    
    void information(int a){
       balance=a;
       System.out.println("Balance is: "+ balance);
    }
 void withdraw(int amount){
        if(balance<amount){
            System.out.println("Balance is insufficient");
        }
        else{
            balance-=amount;
            System.out.println("New balance is: "+balance);
        }
       
    }
     void deposit(int amount){
        balance+=amount;
        System.out.println("New balance is: "+balance);
    }
}


