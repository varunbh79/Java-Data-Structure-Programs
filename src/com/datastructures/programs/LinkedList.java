package com.datastructures.programs;


// A complete working Java program to demonstrate deletion in singly
// linked list
class LinkedList {

    private Node head;

    public static void main (String[] args) {

        int val = 3;
        LinkedList linkedList = new LinkedList ();
        linkedList.insertAtEnd ( 12 );
        linkedList.insertAtEnd ( 13 );
        linkedList.insertAtEnd ( 14 );
        linkedList.insertAtEnd ( 15 );
        linkedList.insertAtEnd ( 17 );
        linkedList.insertNodeBefore ( 17 );
        linkedList.insertAtPosition ( val );
        linkedList.displayNodes ();
        System.out.println ( "------------------" );
        linkedList.searchNode ( 13 );
        linkedList.findPredecessor ( 13 );
        System.out.println ( "Number of nodes in list " + linkedList.countNodes () );
        System.out.println ( "The element found at position 3 is :" + linkedList.findElementByPosition ( 3 ) );
        Node n = linkedList.reverseList ();
        linkedList.displayNodes ();
    }

    private int countNodes () {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private Node reverseList () {
        Node p = head;
        Node prev = null;
        Node next;
        while (p != null) {
            next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        head = prev;
        return head;
    }


    private int findElementByPosition (int pos) {

        Node p = head;
        if (p == null) return -1;
        for (int i = 1; i < pos && p != null; i++) {
            p = p.next;
        }
        return p != null ? p.data : -1;
    }

    private void findPredecessor (int data) {
        Node temp = head;
        int pos = 1;
        while (temp.next != null) {
            if (temp.next.data == data) {
                break;
            }
            pos++;
            temp = temp.next;
        }
        if (temp.next != null) {
            System.out.println ( "Predecessor element is " + temp.data + "found at :" + pos );
        } else {
            System.out.println ( "Predecessor element not found" );
        }
    }

    private void insertNodeBefore (int data) {
        Node t = head;
        Node temp = new Node ( 19 );
        while (t.next != null) {
            if (t.next.data == data)
                break;
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
    }

    private void insertAtPosition (int k) {
        Node l = head;
        if (l == null) return;
        Node newNode = new Node ( 20 );
        for (int i = 1; i < k - 1 && l != null; i++) {
            l = l.next;
        }
        if (l != null) {
            newNode.next = l.next;
            l.next = newNode;
        }
    }


    public void insertNode (int data) {
        Node newNode = new Node ( data );
        newNode.next = head;
        head = newNode;
    }

    private void insertAtEnd (int data) {
        Node p;
        Node temp = new Node ( data );
        if (head == null) {
            head = temp;
            return;
        }
        p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = temp;
    }

    private void searchNode (int key) {
        Node t = head;
        int pos = 1;
        while (t != null) {
            if (t.data == key) {
                break;
            }
            pos++;
            t = t.next;
        }
        if (t == null)
            System.out.println ( "Element not found" );
        else
            System.out.println ( "Element found at position : " + pos );

    }


    private void displayNodes () {

        Node node = head;
        while (node != null) {
            System.out.print ( node.data + "-->" );
            node = node.next;
        }
    }


    public void deleteNode (int data) {

        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == data) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != data) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    class Node {

        int data;
        Node next;

        Node (int data) {
            this.data = data;
            next = null;
        }
    }

}
