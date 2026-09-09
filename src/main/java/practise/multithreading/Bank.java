package practise.multithreading;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank{

    int balance = 1000;
//    Using synchronized
//    public synchronized void withdrawal(int amount){
//        System.out.println(Thread.currentThread().getName() + "trying to withdraw " + amount);
//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName() + " Processing");
//            try{
//                Thread.sleep(1000);
//            }catch(InterruptedException i){
//
//            }
//                    balance -= amount;
//
//            System.out.println(Thread.currentThread().getName() + " withdrawal complete");
//            System.out.println(balance);
//        }
//        else{
//            System.out.println(Thread.currentThread().getName() + " has no sufficient balance");
//        }
//    }

    // using Lock interface
    public final Lock lock = new ReentrantLock();
    public void withdrawal(int amount){
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName() + " Trying to withdraw " + amount);
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Processing withdrawal");
                if(balance >= amount){
                    balance -= amount;
                    System.out.println("Transaction successful, Remaining balance is: " + balance);
                }
                else
                    System.out.println(Thread.currentThread().getName() + " has no sufficient balance");
            }else{
                Thread.currentThread().interrupt();
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will retry later");
            }

        }catch (Exception e){
            System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will retry later");
        }
    }

}
