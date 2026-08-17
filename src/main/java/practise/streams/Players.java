package practise.streams;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Players {

    public String name;
    public int number;

    Players(String name, int number){
        this.name = name;
        this.number = number;
    }

}
