package practise.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AverageAge {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Virat", 35));
        persons.add(new Person("AB Devilliers", 37));
        persons.add(new Person("Chris", 40));
        persons.add(new Person("Chris", 45));

        //Average age
        double averageAge = persons.stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println((int)averageAge);

        //Sum of age
        int totalAge = persons.stream().mapToInt(Person::getAge).sum();
        System.out.println(totalAge);

        //Even age
        int[] evenAge = persons.stream().mapToInt(Person::getAge).filter(x -> x % 2 ==0).toArray();
        for(int i : evenAge){
            System.out.println(i);
        }

        //sort persons
        persons.sort((a, b) -> (-a.getAge() + b.getAge()));
        System.out.println("Sorted by age");
        for(Person person: persons){
            System.out.println(person.getAge());
        }
        Comparator<Person> comparator = Comparator.comparing(Person::getName).thenComparing(Person::getAge).reversed();
        persons.sort(comparator);
        System.out.println("Sorted by name, then age");
        for(Person person: persons){
            System.out.println(person.getName() + " " + person.getAge());
        }

        // get name sof employees
        Comparator<Person> comparatorPerson = Comparator.comparing(Person::getName);
        persons.sort(comparatorPerson);
        List<String> allNames = persons.stream().map(e -> e.name).toList();
        for(String p: allNames){
            System.out.println(p);
        }

        // print whose age is greater than 37
        List<Person> ages = persons.stream().filter(e-> e.getAge() > 37).toList();
        System.out.println("Persons with age greater than 37 are: ");
        for(Person person: ages){
            System.out.println(person.getName());
        }
    }
}
