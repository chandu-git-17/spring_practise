package practise.designpattern.flyweight;

public class TeamJersey implements Jersey{

    private final String country;
    private final String color;

    public TeamJersey(String country, String color){
        this.color = color;
        this.country = country;
        System.out.println(country + " Jersey created");
    }

    @Override
    public void display(){
        System.out.println(country + " " + color);
    }

}
