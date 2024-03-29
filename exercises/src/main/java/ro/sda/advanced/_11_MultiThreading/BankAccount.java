package ro.sda.advanced._11_MultiThreading;
/**
        Create and start threads.

        Create first a BankAccount class which will have a double balance and a String accountNumber.
        The class should  contain the following methods:
        - a constructor which initialize both fields
        - a method deposit which adds to the account balance
        - a method withdraw which subtracts from the account balance
        - toString() method which prints the account details

        We could have three people using a joint bank account at the same time.
        Create and start three threads that use the same BankAccount instance and an initial balance of $1000.00.
        One will deposit $300.00 into the bank account, and then withdraw $50.00.
        Another will deposit $203.75 and then withdraw $100.00
        And the last one will withdraw 103.25 and deposit 600

        --> for each Thread add a Thread.sleep(100) before the operations to the account
         to mimic some heavy work that takes 100 milliseconds for each thread

        --> add Thread.sleep(1000) in main method in order for the main thread to not exit the program
        before the other threads complete their executions

        After testing how multithreading non-safe behaviour is working, we need to make the methods thread-safe

        Hint:
        - use synchronized keyword for the methods from BankAccount class

        */

public class BankAccount {

    private double balance;

    private String accountName;

    public BankAccount(double balance, String accountName) {
        this.balance = balance;
        this.accountName = accountName;
    }

    public synchronized void deposit(double amount) {
        this.balance += amount;

    }

    public synchronized void withdraw(double amount) {
        this.balance -= amount;


    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}


