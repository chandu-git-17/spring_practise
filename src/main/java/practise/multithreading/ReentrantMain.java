package practise.multithreading;

public class ReentrantMain{
    public static void main(String[] args) {
        ReentrantExample reentrantExample = new ReentrantExample();
        reentrantExample.outerLock();
    }
}
