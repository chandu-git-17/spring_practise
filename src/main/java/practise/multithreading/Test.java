package practise.multithreading;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Test1 test1 = new Test1();
        Thread thread = new Thread(test1);
        thread.start();
        for(int i = 0; i< 10; i++){
            System.out.println("Hello " + Thread.currentThread().getName());
        }
        thread.join();
        System.out.println("completed");

    }
}
