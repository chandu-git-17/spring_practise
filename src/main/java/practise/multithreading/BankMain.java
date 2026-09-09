package practise.multithreading;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                bank.withdrawal(520);
            }
        };
        Thread t1 = new Thread(runnable, "Chandra shekar");
        Thread t2 = new Thread(runnable, "Harini");
        t1.start();
        t2.start();
    }

}
