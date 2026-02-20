package practise.streams;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        LambdaPractise le = (a, b) -> a * b;
        LambdaSalary ls = salary -> salary <= 20000 ? salary * 1.1 : salary;
        System.out.println(le.multiply(1,2));
        List<Double> lsl = new ArrayList<>();
        lsl.add(20000.0);
        lsl.add(-100.0);
        List<Double> updatedSalaries = lsl.stream().filter(s -> s > 0).map(ls::salaryCalculator).toList();
        System.out.println(updatedSalaries);

        //Keep numbers less than 3
        int[] a = {1,2,3,4,4};
        int[] resultOfA = Arrays.stream(a).filter(x -> x <= 3).toArray();
        System.out.println("Result of print numbers less than 3");
        Arrays.stream(resultOfA).forEach(System.out::println);

        //Double all elements
        String resultOfDouble = Arrays.toString(Arrays.stream(a).map(x -> x + x).toArray());
        System.out.println("Double of all elements" + resultOfDouble);

        //Numbers less than 4 and square them
        int[] resultOfSquare = Arrays.stream(a).filter(x -> x < 4).map(x -> x * x).toArray();
        System.out.println("Result of squared numbers" + Arrays.toString(resultOfSquare));

        // Multiplication of all numbers
        OptionalInt multiplyOfAll = Arrays.stream(a).reduce((x, y) -> x * y);
        System.out.println("Multiplication of All numbers is " + multiplyOfAll.getAsInt());

        //Reducing char array to string
        List<String> stringArray = new ArrayList<>();
        stringArray.add("Virat Kohli is ");
        stringArray.add("captain of RCB");
        String resultString = stringArray.stream().reduce("", (s1, s2) -> s1 + s2);
        System.out.println(resultString);

        //Calculate the length of strings
        System.out.println("Length of the Strings are: " + stringArray.stream().map(x -> x.length()).toList());

        //Salary operation on single salary
        int salary = 10;
        //System.out.println()

        //flatMap
        List<List<String>> data = List.of(
                List.of("A","B"),
                List.of("C","D")
        );
        System.out.println(data.stream().map(Collection::stream).toList());

        //Even numbers
        List<Integer> resultList = Arrays.stream(a).filter(x -> x % 2 == 0).boxed().toList();
        System.out.println("Even numbers are: " + resultList);

        //Find maximum number
        int n = Arrays.stream(a).max().getAsInt();
        System.out.println("Maximum number in the array is: " + n);

        //Find duplicates in array
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = Arrays.stream(a).filter(x -> !seen.add(x)).boxed().toList();
        System.out.println("duplicate elements are: " + duplicates);

        //count on condition
        System.out.println("Count on condition: "+ Arrays.stream(a).filter(x -> x > 2).count());

        //Converting list of string to upper case
        System.out.println("uppercase string is: " + resultString.describeConstable().stream()
                .map(String::toUpperCase));



    }
}
