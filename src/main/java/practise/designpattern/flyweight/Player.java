package practise.designpattern.flyweight;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private String name;
    private Integer runs;
    private Jersey jersey;

    public Player(String name, Integer runs, String color, String country){
        this.name = name;
        this.runs = runs;
        this.jersey = JerseyFactory.getJersey(country, color);
    }

}
