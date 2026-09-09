package practise.multithreading;

public class MyThread implements Runnable{

    Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }
    public synchronized void run(){
        for(int i = 0; i < 10000; i++){
            counter.increment();
        }


    }

}
