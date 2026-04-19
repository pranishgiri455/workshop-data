class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("---------------------------");
    }
}

public class BankAcc {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Pratik", 5000);
        BankAccount acc2 = new BankAccount(102, "Ram", 10000);

        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.displayBalance();

        acc2.deposit(5000);
        acc2.withdraw(20000); 
        acc2.displayBalance();
    }
}