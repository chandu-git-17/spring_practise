package practise.designpattern.facade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private Boolean fitness;
    private Boolean selected;
    private Boolean contract;
}
