package com.datastructures.programs;


class EmployeeNode {

    EmployeeNode head;

    private Employee employee;
    private EmployeeNode next;
    private Integer size;

    public EmployeeNode (Employee employee) {
        this.employee = employee;
    }

    public Integer getSize () {
        return size;
    }

    public void setSize (Integer size) {
        this.size = size;
    }

    public Employee getEmployee () {
        return employee;
    }

    public void setEmployee (Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext () {
        return next;
    }

    public void setNext (EmployeeNode next) {
        this.next = next;
    }
}

class LinkedListImpl {

    EmployeeNode insertFront (Employee employee, EmployeeNode node) {

        EmployeeNode node1 = getEmployeeNode ( employee );
        node1.setNext ( node );
        return node1;
    }

    private EmployeeNode getEmployeeNode (Employee employee) {
        EmployeeNode employeeNode = new EmployeeNode ( employee );
        employeeNode.setEmployee ( employee );
        employeeNode.setNext ( null );
        return employeeNode;
    }

    EmployeeNode reverseNodes (EmployeeNode node) {
        EmployeeNode current = node;
        EmployeeNode prev = null;
        while (node != null) {
            EmployeeNode temp = node.getNext ();
            prev = temp;
            node.setNext ( prev );
            node = temp.getNext ();
        }
        return prev;
    }


    int getNodeSize (EmployeeNode node) {

        int count = 0;
        EmployeeNode current = node;
        while (node != null) {
            count += 1;
            node = node.getNext ();
        }
        return count;
    }

    EmployeeNode insertNode (Employee employee, EmployeeNode root) {
        if (root == null)
            return getEmployeeNode ( employee );
        else {
            root.setNext ( insertNode ( employee, root.getNext () ) );
        }
        return root;
    }

    void printList (EmployeeNode root) {

        if (root != null) {
            System.out.println ( root.getEmployee () );
            printList ( root.getNext () );
        } else
            System.out.println ( "Empty List" );
    }
}


class Test {
    public static void main (String[] args) {

        EmployeeNode root = null;
        LinkedListImpl linked = new LinkedListImpl ();
        EmployeeNode employeeNode = new EmployeeNode ( new Employee ( "Varyb00", "Linker", 123 ) );
        EmployeeNode employeeNode2 = new EmployeeNode ( new Employee ( "Johhny", "Q", 122 ) );
        EmployeeNode employeeNode3 = new EmployeeNode ( new Employee ( "Katy", "Pery", 222 ) );
        EmployeeNode employeeNode4 = new EmployeeNode ( new Employee ( "Harry", "Potter", 190 ) );

        root = linked.insertNode ( employeeNode.getEmployee (), root );
        root = linked.insertNode ( employeeNode2.getEmployee (), root );
        root = linked.insertFront ( employeeNode3.getEmployee (), root );
        root = linked.insertFront ( employeeNode4.getEmployee (), root );
        linked.printList ( root );
        System.out.println ( "final count is " + linked.getNodeSize ( root ) );
        System.out.println ( "-------------------Reverse" );
        root = linked.reverseNodes ( root );
        linked.printList ( root );
    }
}
