public class BankCheck{
    static void main(String[] args) {
        BankAccount acc = new BankAccount(1001, "Diya", 5000);
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.showBalance();
 }
}