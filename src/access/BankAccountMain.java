package access;

public class BankAccountMain {
    static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(30000);
        System.out.println("balance = " + account.getBalance());
    }
}
