package desktop.ifnu.bima.oop.javacollectionframework;

import java.util.Objects;

public class Customer {
    private Long id;
    private String name;
    private Integer age;

    public Customer(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id)
                && Objects.equals(name, customer.name)
                && Objects.equals(age, customer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
