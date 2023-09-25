import java.util.*;

class Node {
    int data;
    Node next;

    Node (int d) {
        this.data = d;
        next = null;
    }
}

public class stack {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node head = null;

        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display");

            System.out.print("Enter the Choice : ");
            switch(sc.nextInt()) {
                case 0 : System.out.println("Exiting..."); System.exit(0); break;
                case 1 : head = insert(head); break;
                case 2 : head = delete(head); break;
                case 3 : display(head); break;
                default : System.out.println("Invalid choice"); break;
            }
        }
    }

    public static Node insert(Node start) {
        System.out.print("Enter the element for stack : ");
        Node newNode = new Node(sc.nextInt());

        if (start == null) {
            start = newNode;
            return start;
        }
        newNode.next = start;
        start = newNode;
        return start;
    }

    public static Node delete(Node start) {
        if (start == null) {
            System.out.println("Stack is Empty");
            return start;
        }
        System.out.println(start.data + " is removed form Stack \n");
        start = start.next;
        return start;
    }

    public static void display(Node start) {
        if (start == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node tempNode = start;
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}