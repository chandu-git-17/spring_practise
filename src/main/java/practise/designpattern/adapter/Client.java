package practise.designpattern.adapter;

public class Client {
    public static void main(String[] args) {
        Bowler bowler = new BaseballToCricketAdapter();
        System.out.println(bowler.bowl());
    }
}


//Adapter Pattern allows an incompatible class (Pitcher) to behave like a compatible class (Bowler)
//by introducing an Adapter that implements the target interface and delegates calls to the adaptee.