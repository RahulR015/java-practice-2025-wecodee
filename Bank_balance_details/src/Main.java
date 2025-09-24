import java.util.*;
public class Main {
    public static void main(String[] args)
    {
       // Scanner sc = new Scanner(System.in);
        BankAccount prop =new BankAccount(1789654321,1000.00);
        System.out.println("AccountNumber: "+prop.getAccountNumber());
        prop.deposit(1000.00);
        prop.deposit("7000");
        System.out.println("Balance: "+prop.getBalance());
        prop.withdraw(1000);
        System.out.println("Balance: "+prop.getBalance());
    }
    }