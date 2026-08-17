package practise.streams;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PlayerList {
    private String name;
    private List<String> skills;

    public PlayerList(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}
