import java.util.Scanner;
class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void Deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    double checkBalance() {
        return balance;
    }
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
 }

}
public class Hackathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account numb: ");
        Long accountnumb = sc.nextLong();
        System.out.println("Enter account holder name: ");
        String name = sc.next();
        System.out.println("Enter initial balance: ");
        double bal = sc.nextDouble();
        BankAccount a = new BankAccount(accountnumb, name, bal);
        System.out.println("enter deposti amount:");
        double d = sc.nextDouble();
        a.Deposit(d);
        System.out.println("enter withdraw amount:");
        double b = sc.nextDouble();
        a.withdraw(b);
        System.out.println("details : ");
        a.displayAccountDetails();
        System.out.println("balance: " + a.checkBalance());

        
    }
}
 
    

