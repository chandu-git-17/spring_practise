package practise.designpattern.facade;

public class TeamManagementFacade {
    private SelectionCommittee selectionCommittiee = new SelectionCommittee();
    private FitnessTeam fitnessTeam = new FitnessTeam();
    private ContractTeam contractTeam = new ContractTeam();
    public String playerOnboard(Player player){
        if(fitnessTeam.fitnessClearance(player)
                && contractTeam.contract(player)
                && selectionCommittiee.selcetedOrNot(player))
            return player.getName() + " selected";
        return player.getName() + " not selected";
    }
}
