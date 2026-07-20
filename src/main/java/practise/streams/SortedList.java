package practise.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class SortedList {
    static List<Integer> list1 = Arrays.asList(1000,3000,5000,7000,7000,8000);
    static List<Integer> list2 = Arrays.asList(2,4,6,8);



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,6};

        System.out.println(Stream.concat(list1.stream(), list2.stream()).sorted().toList());
        System.out.println(list1.stream().filter(x -> x < 5000).map(x -> x + 1000).toList());
        System.out.println(list1.stream().filter(x -> x % 3 != 0).toList());

    }

}
