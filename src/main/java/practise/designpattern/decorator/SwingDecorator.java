    package practise.designpattern.decorator;

    public class SwingDecorator implements Bowler {
        private Bowler bowler;
        public SwingDecorator(Bowler bowler){
            this.bowler = bowler;
        }
        public String bowl(){
            String result = this.bowler.bowl();
            return result + " can Swing";
        }
    }
