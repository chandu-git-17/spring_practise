package practise.designpattern.decorator;

public class YorkerDecorator implements Bowler{
    private Bowler bowler;
    public YorkerDecorator(Bowler bowler){
        this.bowler = bowler;
    }

    public String bowl(){
        return this.bowler.bowl() + " can bowl yorkers";
    }

}
