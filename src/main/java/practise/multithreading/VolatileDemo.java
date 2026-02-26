package practise.multithreading;

public class VolatileDemo {
    // Case - 1 (Problem)
    //public boolean flag = false;
    public volatile boolean flag = false;


    public void printFlag(){
        while(!flag){

        }
        System.out.println(flag);
    }
    public void makeFlagTrue(){
        flag = true;
    }
}
