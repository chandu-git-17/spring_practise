package practise.comparable;

import practise.designpattern.builder.Student;

public class Employee implements Comparable<Employee> {
    public String name;
    public int salary;
    Employee(String name, int salary){
        this.salary = salary;
        this.name = name;
    }
    public int getSalary(){
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return -this.salary + o.salary;
    }
}
