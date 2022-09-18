package data.structuresandalgorithms.deepdive.using.java.vectors;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeVectors = new Vector<>();
        employeeVectors.add(new Employee("Jine", "Jones", 123));
        employeeVectors.add(new Employee("Jihn", "Doe", 4567));
        employeeVectors.add(new Employee("Miry", "Smith", 22));
        employeeVectors.add(new Employee("Make", "Wilson", 3245));

        employeeVectors.set(1, new Employee("Jehn", "Adams", 4568));
        employeeVectors.add(3, new Employee("Jihn", "Doe", 4567));

        System.out.println(employeeVectors.contains(new Employee("Miry", "Smith", 22)));
        System.out.println(employeeVectors.indexOf(new Employee("Jihn", "Doe", 4567)));

        employeeVectors.remove(2);
        employeeVectors.forEach(employee -> System.out.println(employee));



    }
}
