public class Amin_Q3_BankAccount {
    String accountHolderName;
    double balance;

    // constructor
    public Amin_Q3_BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // add balance
    public void addBalance(double amount) {
        balance += amount;
        System.out.printf("\nMr.%s, %.2f \u20ac was added to your account.\n", accountHolderName,amount);
        System.out.printf("\nYour current balance is: %.2f \u20ac\n", balance);

    }

    // deduce balance
    public void deductBalance(double amount) {
        double diff = balance - amount;
        if(diff < 0) {
            System.out.printf("\n%.2f \u20ac is more than your current balance of %.2f.\n", amount, balance);
            System.out.printf("\nTransaction denied!\n");
            return;
        } else {
            balance += amount;
            System.out.printf("\nMr.%s, %.2f \u20ac was deducted from your account.\n", amount, accountHolderName);
            System.out.printf("\nYour current balance is: %.2f \u20ac\n", balance);

        }
    }
}
