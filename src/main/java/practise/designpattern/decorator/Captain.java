package practise.designpattern.decorator;

public class Captain {
    public static void main(String[] args) {
        Bowler bowler = new YorkerDecorator(new SwingDecorator(new FastBowler()));
        String result = bowler.bowl();
        System.out.println(result);
    }
}
