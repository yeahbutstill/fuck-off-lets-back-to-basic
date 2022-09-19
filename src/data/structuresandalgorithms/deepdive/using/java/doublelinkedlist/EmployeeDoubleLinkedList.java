package data.structuresandalgorithms.deepdive.using.java.doublelinkedlist;

public class EmployeeDoubleLinkedList {

    private EmployeeNode head;

    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null) {
            tail = node;
        } else {
            head.setPerevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
            node.setPerevious(tail);
        }

        tail = node;
        size++;
    }

    // challenge
    public Boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        if (head == null) {
            return false;
        }

        // find the existing employee
        EmployeeNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPerevious(current.getPerevious());
        newNode.setNext(current);
        current.setPerevious(newNode);

        if (head == current) {
            head = newNode;
        } else {
            newNode.getPerevious().setNext(newNode);
        }

        size++;

        return true;

    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPerevious(null);
        }

        head = head.getNext();
        size--;

        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }

        EmployeeNode removeNode = tail;

        if (tail.getPerevious() == null) {
            head = null;
        } else {
            tail.getPerevious().setNext(null);
        }

        tail = tail.getPerevious();
        size--;

        removeNode.setPerevious(null);
        return removeNode;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
