package data.structuresandalgorithms.deepdive.using.java.hashchallenge1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(123, "Jane", "Jones"));
        employees.add(new Employee(5678, "Jhon", "Doe"));
        employees.add(new Employee(45, "Mike", "Wilson"));
        employees.add(new Employee(5555, "Mary", "Smith"));
        employees.add(new Employee(5678, "Jhon", "Doe"));
        employees.add(new Employee(3948, "Bill", "End"));
        employees.add(new Employee(123, "Jane", "Jones"));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Employee> employeeTable = new HashMap<>();
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> remove = new ArrayList<>();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeTable.containsKey(employee.getId())) {
                remove.add(employee);
            } else {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for (Employee employee : remove) {
            employees.remove(employee);
        }

        System.out.println("--------------------------------------");
        employees.forEach(e -> System.out.println(e));

    }

}
