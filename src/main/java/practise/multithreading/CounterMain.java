package practise.multithreading;

public class CounterMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread myThread = new MyThread(counter);
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);
        thread1.start();
        thread2.start();
        thread3.start();
        try{
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException i){
            System.out.println(i);
        }

        System.out.println(counter.getCount());

    }
}
