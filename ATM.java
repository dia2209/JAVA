//ATM Simulation && Name: Diya Manandhar
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float balance = 1000;
        int choice;
        float amount;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Balance = Rs. " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextFloat();
                    if(amount > balance)
                        System.out.println("Insufficient balance!");
                    else {
                        balance -= amount;
                        System.out.println("Withdrawn: Rs. " + amount);
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextFloat();
                    balance += amount;
                    System.out.println("Deposited: Rs. " + amount);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while(choice != 4);
    }
}
