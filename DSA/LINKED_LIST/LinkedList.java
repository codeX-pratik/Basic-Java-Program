import java.util.*;

class Node {
    int data;
    Node next;
}

public class LinkedList {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Node start = null;
        while (true) {
            System.out.println("0. Exit");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at any position");
            System.out.println("4. Delete from beginning");
            System.out.println("5. Delete from end");
            System.out.println("6. Delete at any positon");
            System.out.println("7. count the Number of Node");
            System.out.println("8. Soting");
            System.out.println("100. Display");

            System.out.print("Enter your choice : ");
            switch(sc.nextInt()) {
                case 0 : System.out.println("Exiting..."); System.exit(0); break;
                case 1 : start = insBeg(start); break;
                case 2 : start = insEnd(start); break;
                case 3 : start = insAny(start); break;
                case 4 : start = delBeg(start); break;
                case 5 : start = delEnd(start); break;
                case 6 : start = delAny(start); break;
                case 7 : System.out.println("Number of Nodes are : " + count(start)); break;
                case 8 : sort(start); break;

                case 100 : display(start); break;
                default : System.out.println("Invalid Choice"); break;
            }
        }
        
    }

    public static void create(Node start) {
        System.out.print("Enter the data for Linked List : ");
        start.data = sc.nextInt();
        start.next = null;
    }

    public static Node insBeg(Node start) {
        Node newNode = new Node();
        create(newNode);

        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
        return start;
    }

    public static Node insEnd(Node start) {
        Node newNode = new Node();
        create(newNode);

        if (start == null) {
            start = newNode; 
        } else {
            Node tempNode = start;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        return start;
    }

    public static Node insAny(Node start) {
        System.out.print("Enter the position to insert the Node : ");
        int position = sc.nextInt();

        if (position < 1) {
            System.out.println("Invalid Position");
            return start;
        } else if (position == 1) {
            start = insBeg(start);
            return start;
        }

        Node newNode = new Node();
        create(newNode);
        Node tempNode = start;
        int count = 1;
        
        while (tempNode != null) {
            if (count == position -1) {
                break;
            }
            count++;
            tempNode = tempNode.next;
        }

        newNode.next = tempNode.next;
        tempNode.next = newNode;
        return start;
    }

    public static Node delBeg(Node start) {
        if (start == null) {
            System.out.println("List is Empty");
            return start;
        }
        start = start.next;
        System.out.println("The Node is deleted \n");
        return start;
    }

    public static Node delEnd(Node start) {
        if (start == null) {
            System.out.println("List is Empty");
            return start;
        } else if (start.next == null) {
            start = null;
            return start;
        }
        Node secLastNode = start;
        Node lastNode = start.next;
        while (lastNode.next != null) {
            secLastNode = secLastNode.next;
            lastNode = lastNode.next;
        }
        secLastNode.next = null;
        System.out.println("The Node is deleted \n");
        return start;
    }

    public static Node delAny(Node start) {
        System.out.print("Enter the position to be deleted : ");
        int position = sc.nextInt();

        if (position < 1) {
            System.out.println("Invalid position");
            return start;
        } else if (position == 1) {
            start = delBeg(start);
            return start;
        }

        Node tempNode1 = start;
        Node tempNode2 = start.next;
        int count = 1;

        while (tempNode2.next != null) {
            if (count == position -1) {
                break;
            }
            count++;
            tempNode1 = tempNode1.next;
            tempNode2 = tempNode2.next;
        }

        tempNode1.next = tempNode2.next;
        System.out.println("The Node is deleted \n");
        return start;
    }

    public static int count(Node start) {
        if (start == null) {
            return 0;
        }
        int c = 0;
        Node tempNode = start;
        while (tempNode != null) {
            c++;
            tempNode = tempNode.next;
        }
        return c;
    }

    public static void sort(Node start) {
        Node firstNode = start;
        while (firstNode != null) {
            Node secondNode = firstNode.next;
            while (secondNode != null) {
                if (firstNode.data > secondNode.data) {
                    int temp = firstNode.data;
                    firstNode.data = secondNode.data;
                    secondNode.data = temp;
                }
                secondNode = secondNode.next;
            }
            firstNode = firstNode.next;
        }
        System.out.println("Sorted !");
        return;
    }

    public static void display(Node start) {
        if (start == null) {
            System.out.println("List is Empty \n");
            return;
            
        }
        Node tempNode = start;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
}