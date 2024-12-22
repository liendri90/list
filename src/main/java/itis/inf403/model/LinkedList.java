package itis.inf403.model;

public class LinkedList {
    public Node first;

    public void add(int data) {
        Node newNode = new Node(data);
        if (first == null) {
            first = newNode;
            return;
        }
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void output() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void outputReverse(Node node) {
        if (node == null) {
            return;
        }
        outputReverse(node.next);
        System.out.print(node.data + " ");
    }

    public Node getFirst() {
        return first;
    }

}
