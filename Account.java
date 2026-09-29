public class Account {
    private double balance;


    public Account() {
        balance = 0;
    }

    public Account(double balance, double bonus) {
        this.balance = balance + bonus;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(1000, 200);

        a1.deposit(500);
        a1.withdraw(200);
        System.out.println("a1 balance: " + a1.getBalance());

        a2.withdraw(300);
        System.out.println("a2 balance: " + a2.getBalance());
    }
}
