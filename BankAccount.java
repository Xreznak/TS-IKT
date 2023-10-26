abstract class BankAccount {
    protected String accountNumber;
    protected double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }


    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Nedostatočný zostatok na účte.");
        }
    }
}

