/*Create a BankAccount class with a withdrawal method. Throw and handle a custom InsufficientFundException if withdrawal exceeds balance.*/
//Name:Diya Manandhar
class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class BankAccount1 {
    private double balance;

    public BankAccount1(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount > balance) {
            throw new InsufficientFundException("Withdrawal failed: Not enough balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

