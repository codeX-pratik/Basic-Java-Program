import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        next = null;
    }
}

public class queue {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Node front = null , rear = null;

        while(true) {
            System.out.println("0. Exit");
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display");

            System.out.print("Enter your Choice : ");
            switch(sc.nextInt()) {
                case 0 : System.out.println("Exiting..."); System.exit(0); break;
                case 1 : front = insert(front, rear); rear = RearNode(front); break;
                case 2 : front = delete(front, rear); break;
                case 3 : display(front, rear); break;
                default : System.out.println("Invalid Choice"); break;
            }
        }
    }

    public static Node RearNode(Node front){
        if (front == null) {
            return null;
        }
        Node tempNode = front;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public static Node insert(Node front , Node rear) {
        System.out.print("Enter the element for Queue : ");
        Node newNode = new Node(sc.nextInt());

        if (front == null) {
            front = newNode;
            rear = newNode;
            return front;
        }
        // Node tempNode = front;
        // while (tempNode.next != null) {
        //     tempNode = tempNode.next;
        // }
        // tempNode.next = newNode;
        // return front;
        RearNode(front).next = newNode;
        return front;
    }

    public static Node delete(Node front , Node rear) {
        if (front == null) {
            System.out.println("Queue is Empty");
            return front;
        }
        System.out.println(front.data + " is romoved from the Queue \n");
        front = front.next;
        return front;
    }

    public static void display(Node front , Node rear) {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }
        Node tempNode = front;
        while(tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}