package practise.comparator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        int[] a = {1,2,3};
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
        employeeList.sort(new EmployeeSalary());
        System.out.println(list);
        for(int i = 0; i < employeeList.size(); i++){
            System.out.println(employeeList.get(i).getSalary());
        }
    }
}
