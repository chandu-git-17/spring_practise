package practise.comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Virat", 1000));
        list.add(new Employee("AB Devilliers", 10000));
        list.add(new Employee("Chris", 100000));
        list.sort(null);
        for(Employee e : list){
            System.out.println(e.name + " " + e.salary);
        }
    }
}
