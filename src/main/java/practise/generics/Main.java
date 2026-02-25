package practise.generics;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        Integer printInteger = 21;
        String string = "Virat";
        GenericsPractise<Integer, List, String> gpList = new GenericsPractise<>(printInteger, list, string);
        gpList.print();
        gpList.genericPrint();
    }
}
