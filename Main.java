public class Main {
    public static void main(String[] args) {
        Dog pes = new Dog("Dunčo", 3);
        Cat macka = new Cat("Ares", 7);

        System.out.println();
        System.out.println("Pes:");
        pes.displayInfo();
        pes.makeSound();

        System.out.println();
        System.out.println("Macka:");
        macka.displayInfo();
        macka.makeSound();

        System.out.println();
        Rectangle rectangle = new Rectangle("Moj obdlznik", 3,3);
        rectangle.displayInfo();

        System.out.println();
        Circle circle = new Circle("Moj kruh", 6);
        circle.displayInfo();

        // Vytvorenie účtov
        System.out.println();
        SavingsAccount savingsAccount = new SavingsAccount("ABC123", 1250, 2.5);
        CheckingAccount checkingAccount = new CheckingAccount("XYZ987", 2000, 2.0);

        // Výpis zostatkov pred transakciami
        System.out.println();
        System.out.println("Zostatok na účte úspor: " + savingsAccount.getBalance());
        System.out.println("Zostatok na kontrolnom účte: " + checkingAccount.getBalance());

        // Vklady a výbery
        System.out.println();
        savingsAccount.deposit(500);
        checkingAccount.deposit(200);
        savingsAccount.withdraw(300);
        checkingAccount.withdraw(100);

        // Výpis zostatkov po transakciách
        System.out.println();
        System.out.println("Zostatok na účte úspor po transakciách: " + savingsAccount.getBalance());
        System.out.println("Zostatok na kontrolnom účte po transakciách: " + checkingAccount.getBalance());

        // Výpočet úrokov a odpočet poplatkov za transakcie
        System.out.println();
        savingsAccount.calculateInterest();
        checkingAccount.deductTransactionFee();

        // Výpis zostatkov po úrokoch a poplatkoch
        System.out.println();
        System.out.println("Zostatok na účte úspor po úrokoch: " + savingsAccount.getBalance());
        System.out.println("Zostatok na kontrolnom účte po poplatkoch: " + checkingAccount.getBalance());
    }
}