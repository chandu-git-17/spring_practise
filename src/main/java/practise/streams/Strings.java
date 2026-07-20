package practise.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {
    public static void main(String[] args) {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit");

        //Finding the length of largest string
        int num = strings.stream().mapToInt(String::length).max().orElse(0);
        System.out.println("Length of largest string is: " + num);

        //Finding the largest string
        String largestString = strings.stream().max(Comparator.comparing(String::length)).orElse("no String");
        System.out.println("Largest String is: " + largestString);

        //Sorting the string array
        List<String> sortedList = strings.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("Sorted list is: ");
        for (String s : sortedList) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Merging 2 sorted lists
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> sortedList2 = Stream.concat(list1.stream(), list2.stream()).sorted().toList();
        System.out.println("Sorted lists");
        for (int i : sortedList2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Convert string to uppercase
        List<String> upperString = strings.stream().map(String::toUpperCase).toList();
        System.out.println("String array converted to upper case");
        for (String s : upperString) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Convert first letter of string to capital
        List<String> firstCapital = strings.stream().map(s -> {
            return s.substring(0, 1).toUpperCase() + s.substring(1);
        }).toList();
        System.out.println("First letter capital string list: ");
        for (String s : firstCapital) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Strings starting with A
        List<String> startWithA = strings.stream()
                .filter(s -> s.charAt(0) == 'A' || s.charAt(0) == 'a')
                .toList();
        System.out.println("Strings that start with A");
        for (String s : startWithA) {
            System.out.println(s);
        }

        //Remove empty strings
        List<String> stringsEmpty = Arrays
                .asList("apple", "banana", "cherry", "date", "grapefruit", "");
        List<String> emptyRemoved = stringsEmpty.stream().filter(s -> !s.isEmpty()).toList();
        System.out.println("List of strings after removing empty strings");
        for (String s : emptyRemoved) {
            System.out.print(s + " ");
        }
        System.out.println();

        //length of all strings
        List<Integer> lengthList = strings.stream().map(String::length).toList();
        System.out.println("Length of all strings");
        for (Integer s : lengthList) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Join all strings with comma
        String combined = strings.stream().collect(Collectors.joining(","));
        System.out.println("Combined string is: " + combined);

        //Find longest, shortest string
        Optional<String> longest = strings.stream().max(Comparator.comparing(String::length));
        System.out.println("longest string is: " + longest.get());
        Optional<String> shortest = strings.stream().min(Comparator.comparing(String::length));
        System.out.println("shortest string is: " + shortest.get());

        //sort strings alphabetically
        List<String> sorted = strings.stream().sorted().toList();
        System.out.println("Sorted list alphabetically");
        for (String s : sorted) {
            System.out.print(s + " ");
        }
        System.out.println();

        //sort based on size
        List<String> sizeSort = strings.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("Sorted list based on size");
        for (String s : sizeSort) {
            System.out.print(s + " ");
        }
        System.out.println();

        //Find strings start with vowel
        Optional<String> secondLargest = strings.stream()
                .sorted(Comparator.comparing(String::length))
                .skip(1)
                .findFirst();
        System.out.println(secondLargest.get());

        //second-largest number in an array
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2);
        Optional<Integer> secondLargestNumber = numbers.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second largest integer: " + secondLargestNumber.get());

        //count frequency
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 4, 3, 2);
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int n : numbersList) {
            if (frequency.containsKey(n)) {
                frequency.put(n, frequency.get(n) + 1);
            }
            frequency.putIfAbsent(n, 1);
        }

        int a = 1000;
        int b = 1000;
        if(a == b){
            System.out.println("equal");
        }
    }
}
