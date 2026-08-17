package practise.streams;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String playerName;
    private Country country;

    public Player(String playerName, Country country) {
        this.playerName = playerName;
        this.country = country;
    }

}
