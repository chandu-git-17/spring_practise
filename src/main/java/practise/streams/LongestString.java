package practise.streams;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;
import java.util.stream.Stream;

public class LongestString {
    static List<String> list = Arrays.asList("cricket", "football", "basketball");
    static List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

    public static void main(String[] args) {
        //largest String in a list
        Optional<String> maxString = list.stream().max(Comparator.comparing(String::length));
        System.out.println(maxString.get());
        //largest odd number
        Optional<Integer> maxOddInteger =
                integerList.stream().filter(x -> x % 2 == 1).max(Integer::compareTo);
        System.out.println(maxOddInteger.get());
        //largest number divisible by 3
        Optional<Integer> divisibleBy3 =
                integerList.stream().filter(x -> x % 3 == 0).max(Integer::compareTo);
        System.out.println(divisibleBy3.get());
    }

}
