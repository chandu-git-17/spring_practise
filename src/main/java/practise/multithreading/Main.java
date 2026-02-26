package practise.multithreading;

public class Main{

    public static void main(String[] args) {
        VolatileDemo vd1 = new VolatileDemo();
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            vd1.makeFlagTrue();
        });
        Thread t2 = new Thread(vd1::printFlag);
        t2.start();
        t1.start();
    }

}
