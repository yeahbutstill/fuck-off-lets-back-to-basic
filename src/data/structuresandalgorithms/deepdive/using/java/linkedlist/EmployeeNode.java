package data.structuresandalgorithms.deepdive.using.java.linkedlist;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
