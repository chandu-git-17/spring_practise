package practise.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee();
        employee.setName("employee - 1");
        employee.setSalary(1000);
        Employee employee1 = new Employee();
        employee1.setName("employee - 2");
        employee1.setSalary(100000);
        employeeList.add(employee);
        employeeList.add(employee1);
        list.add(1);
        list.add(2);
        list.sort(new Compare());
        Comparator<Employee> comparator = Comparator.comparing(Employee::getSalary).reversed();
        //employeeList.sort((a, b) -> (-a.getSalary() + b.getSalary()));
        employeeList.sort(comparator);
        System.out.println(list);
        for(Employee emp: employeeList){
            System.out.println(emp.getSalary());
        }
    }
}
