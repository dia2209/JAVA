public class BankDemo {
    public static void main(String[] args) {
        BankAccount1 acc = new BankAccount1(1000); // initial balance

        try {
            acc.withdraw(1500); // attempt to withdraw more than balance
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
