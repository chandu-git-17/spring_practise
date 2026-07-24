package practise.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class JerseyFactory {

    private static Map<String, Jersey> jerseys = new HashMap<>();

    public static Jersey getJersey(String country, String color){
        if(jerseys.containsKey(country)){
            return jerseys.get(country);
        }
        else{
            Jersey newJersey = new TeamJersey(country, color);
            jerseys.put(country, newJersey);
            return newJersey;
        }
    }

}
