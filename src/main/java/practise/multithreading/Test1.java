package practise.multithreading;

public class Test1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i< 10; i++) {
            System.out.println("World " + Thread.currentThread().getName());
            try {
                if(i == 9)
                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
