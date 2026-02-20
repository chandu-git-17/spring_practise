package practise.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        int[] a = {1,2,3,4,5};
        int[] resultOfA = Arrays.stream(a).filter(x -> x <= 3).toArray();
        System.out.println("Result of print numbers less than 3");
        Arrays.stream(resultOfA).forEach(System.out::println);

        //Double all elements
        String resultOfDouble = Arrays.toString(Arrays.stream(a).map(x -> x + x).toArray());
        System.out.println("Double of all elements" + resultOfDouble);

        //Numbers less than 4 and square them
        int[] resultOfSquare = Arrays.stream(a).filter(x -> x < 4).map(x -> x * x).toArray();
        System.out.println("Result of squared numbers" + Arrays.toString(resultOfSquare));

    }
}
