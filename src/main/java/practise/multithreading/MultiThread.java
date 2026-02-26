package practise.multithreading;

public class MultiThread extends Thread{
    private int number = 5;

    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MultiThread mt = new MultiThread(); // New state
        System.out.println(mt.getState());
        mt.start(); // runnable state
        System.out.println(mt.getState());
        Thread.sleep(100);
        System.out.println(mt.getState());
        mt.join();
        System.out.println(mt.getState());


    }
}
