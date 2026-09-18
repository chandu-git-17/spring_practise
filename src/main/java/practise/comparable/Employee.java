package practise.comparable;

import lombok.Getter;

public class Employee implements Comparable<Employee> {
    public String name;
    @Getter
    public int salary;
    Employee(String name, int salary){
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return -this.salary + o.salary;
    }
}
