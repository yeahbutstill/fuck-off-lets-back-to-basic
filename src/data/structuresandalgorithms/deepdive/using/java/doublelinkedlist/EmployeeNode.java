package data.structuresandalgorithms.deepdive.using.java.doublelinkedlist;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    private EmployeeNode perevious;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode() {
    }

    public EmployeeNode getPerevious() {
        return perevious;
    }

    public void setPerevious(EmployeeNode perevious) {
        this.perevious = perevious;
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
