package practise.designpattern.facade;

public class SelectionCommittee {
    public Boolean selcetedOrNot(Player player){
        if(player.getName().equals("Virat"))
            return true;
        return false;
    }
}
