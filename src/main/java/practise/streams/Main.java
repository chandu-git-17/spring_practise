package practise.streams;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        LambdaPractise le = (a, b) -> a * b;
        LambdaSalary ls = salary -> salary <= 20000 ? salary * 1.1 : salary;
        System.out.println(le.multiply(1, 2));
        List<Double> lsl = new ArrayList<>();
        lsl.add(20000.0);
        lsl.add(-100.0);
        List<Double> updatedSalaries = lsl.stream().filter(s -> s > 0).map(ls::salaryCalculator).toList();
        System.out.println(updatedSalaries);

        //Keep numbers less than 3
        int[] a = {1, 2, 3, 4, 4};
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
                List.of("A", "B"),
                List.of("C", "D")
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
        System.out.println("Count on condition: " + Arrays.stream(a).filter(x -> x > 2).count());

        //Converting list of string to upper case
        System.out.println("uppercase string is: " + resultString.describeConstable().stream()
                .map(String::toUpperCase));

        // Count on condition
        System.out.println(Arrays.stream(a).filter(x -> x > 2).count());

        //Find second-highest number
        System.out.println(Arrays.stream(a).distinct().sorted().skip(a.length - 2).findFirst().orElse(0));

        //Find duplicate numbers
        int[] array = {1, 2, 2, 2, 3, 4, 5, 6, 6, 6};
        Set<Integer> setArray = new HashSet<>();
        int[] duplicateArray = Arrays.stream(array).filter(x -> !setArray.add(x)).toArray();
        System.out.println(Arrays.toString(duplicateArray));

        //Find all employee names.
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("person 1", 10));
        persons.add(new Person("person 2", 12));
        persons.add(new Person("person 3", 13));
        persons.add(new Person("person 4", 16));
        System.out.println("List of all persons");
        System.out.println(persons.stream().map(Person::getName).toList());

        //Persons with age greater than 12
        System.out.println("Persons with age greater than 12");
        System.out.println(persons.stream().filter(p -> p.getAge() > 12)
                .map(Person::getName).toList());

        //Count all persons
        System.out.println("Count of all persons: ");
        System.out.println(persons.stream().count());

        //Find the most elderly person
        System.out.println("Person with highest age is: ");
        Person maxAge = persons.stream().max(Comparator.comparing(Person::getAge)).orElse(null);
        System.out.println(maxAge.getName());

        //Sort employees by age
        System.out.println("Employees sorted with age");
        Comparator<Person> comparator = Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed();
        persons.sort(comparator);
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        //find the person with age less than 15 and increase the age by 5
        List<String> ageList = persons.stream().filter(p -> p.getAge() < 15)
                .map(p -> p.getName() + " age is " + (p.getAge() + 5)).toList();
        System.out.println(ageList);

        //sum of even age persons
        System.out.println("Sum of ages of people who have age as even number");
        System.out.println(persons.stream().filter(p -> p.getAge() % 2 == 0)
                .mapToInt(Person::getAge).sum());

        //check if all ages are odd
        System.out.println("Checking if all persons ages are even");
        long countAges =
                persons.stream().filter(p -> p.getAge() % 2 == 0).count();
        long countPersons = persons.size();
        System.out.println(countAges == countPersons ? "Yes, all persons age is even"
                : "No, all persons dont have even age");
        //Another way & better way
        System.out.println(persons.stream().anyMatch(p -> p.getAge() % 2 == 0));
    }
}
