public class Bank {
    Account acc;

    void createAccount(int accNo, String name, double balance) {
        acc = new Account(accNo, name, balance);
        System.out.println("Account Created Successfully!");
    }

    void deposit(double amount) {
        acc.balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= acc.balance) {
            acc.balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void showDetails() {
        acc.display();
    }
}