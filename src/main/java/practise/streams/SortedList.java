package practise.streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SortedList {
    static List<Integer> list1 = Arrays.asList(1,3,5,7);
    static List<Integer> list2 = Arrays.asList(2,4,6,8);

    public static void main(String[] args) {
        System.out.println(Stream.concat(list1.stream(), list2.stream()).sorted().toList());
    }



}
