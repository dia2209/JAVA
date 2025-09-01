/*Implement a BankAccount class with attributes like accountNumber, holderName, and
balance. Add methods for deposit, withdraw, and showbalance with validations.*/
//Name:Diya Manandhar

public class BankAccount{
    int accountNumber;
    String holderName;
    int balance;

     public BankAccount(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }}