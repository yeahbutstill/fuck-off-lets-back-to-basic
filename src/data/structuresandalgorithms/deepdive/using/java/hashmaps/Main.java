package data.structuresandalgorithms.deepdive.using.java.hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee marySmith = new Employee(22, "Mary", "Smith");
        Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
        Employee daniS = new Employee(70, "Dani", "Setiawan");

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        hashMap.put("Setiawan", daniS);
        Employee employee = hashMap.put("Doe", mikeWilson);
        Employee employee1 = hashMap.putIfAbsent("Setiawan", mikeWilson);
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(hashMap.get("someone"));
        System.out.println(hashMap.getOrDefault("someone", mikeWilson));

        System.out.println(hashMap.containsKey("Doe"));
        System.out.println(hashMap.containsValue(janeJones));
        System.out.println(hashMap.remove("Jones"));

        Iterator<Employee> iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));


    }
}
