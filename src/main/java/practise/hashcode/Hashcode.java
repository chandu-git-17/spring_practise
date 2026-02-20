package practise.hashcode;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class Hashcode {

    public static void main(String[] args) {
        Helper h1 = new Helper();
        h1.setId(1);
        h1.setName("AB Devilliers");
        Helper h2 = new Helper();
        h2.setId(1);
        h2.setName("AB Devilliers");
        System.out.println(h1.equals(h2));
        System.out.println(h1.hashCode() == h2.hashCode());

        Set<String> str1 = new HashSet<>();
        str1.add("virat");

        Set<String> str2 = new HashSet<>();
        str2.add("virat");
        System.out.println(str1.equals(str2));

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Virat");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(1, "Virat");
        System.out.println(map1.equals(map2));


    }
}

@Getter
@Setter
class Helper{
    private String name;
    private int id;

    public boolean equals(Helper h){
        return this.id == h.id && h.name.equals(this.name);
    }

    public int hashCode(){
        return Objects.hash(id, name);
    }
}
