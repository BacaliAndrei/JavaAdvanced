package ro.sda.advanced._11_MultiThreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount(1000, "1234");

        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bankAccount.deposit(300);
                bankAccount.withdraw(200);
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bankAccount.deposit(400);
                bankAccount.withdraw(140);
            }
        };
        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                bankAccount.deposit(500);
                bankAccount.withdraw(100);
            }
        };
        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(1000);

        System.out.println(" "+bankAccount.toString());
    }
}
