package practise.designpattern.facade;

public class ContractTeam {
    public Boolean contract(Player player){
        if(player.getName().equals("Virat"))
            return true;
        return false;
    }
}
