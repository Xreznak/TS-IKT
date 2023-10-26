class CheckingAccount extends BankAccount {
    private double transactionFee;


    public CheckingAccount(String accountNumber, double balance, double transactionFee) {
        super(accountNumber, balance);
        this.transactionFee = transactionFee;
    }


    public void deductTransactionFee() {
        if (getBalance() >= transactionFee) {
            withdraw(transactionFee);
            System.out.println("Odpočítané poplatky za transakcie: " + transactionFee);
        } else {
            System.out.println("Nedostatočný zostatok na účte na odpočítanie poplatkov.");
        }
    }
}
