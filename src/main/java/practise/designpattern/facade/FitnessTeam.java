package practise.designpattern.facade;

public class FitnessTeam {
    public Boolean fitnessClearance(Player player){
        if(player.getName().equals("Virat"))
            return true;
        return false;
    }
}
