package practise.designpattern.facade;

public class Captain {
    public static void main(String[] args) {
        TeamManagementFacade teamManager = new TeamManagementFacade();
        Player player = new Player();
        player.setName("Virat");
        String selctionResult = teamManager.playerOnboard(player);
        System.out.println(selctionResult);
    }
}
