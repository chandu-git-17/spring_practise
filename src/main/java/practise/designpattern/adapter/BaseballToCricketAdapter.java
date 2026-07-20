package practise.designpattern.adapter;

public class BaseballToCricketAdapter implements Bowler{
    private Pitcher pitcher = new Pitcher();
    public String bowl(){
        return pitcher.pitch();
    }
}
