package practise.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    public final Lock lock = new ReentrantLock();

    public void outerLock(){
        lock.lock();
        try{
            System.out.println("Outer lock");
            innerLock();
        }catch(Exception e){

        }finally {
            lock.unlock();
        }
    }

    public void innerLock(){
        lock.lock();
        try{
            System.out.println("Inner lock");
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
