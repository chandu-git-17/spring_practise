package practise.streams;

import org.apache.logging.log4j.util.PropertySource;

import java.util.Comparator;

public class Person implements Comparator<Person> {
    public String name;
    public int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o1.age;
    }
}
