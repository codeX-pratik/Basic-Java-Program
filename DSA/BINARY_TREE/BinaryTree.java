import java.util.*;

class Node {
    int data;
    Node right;
    Node left;

    Node (int d) {
        this.data = d;
        right = null;
        left = null;
    }
}

class Tree {
    static int idx = -1;
    public Node buildTree(int nodes[]) {
        idx++;
        if (nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }
}

public class BinaryTree {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Tree tree = new Tree();
        Node root = tree.buildTree(node);
        
        System.out.println(height(root));
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);     
        postorder(root.right);
        System.out.print(root.data + " ");     
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node tempNode = q.remove();
            if (tempNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(tempNode.data + " ");
                if (tempNode.left != null) {
                    q.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    q.add(tempNode.right);
                }
            }
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);
        return leftNode + rightNode + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftsum = sumOfNodes(root.left);
        int rightsum = sumOfNodes(root.right);
        return leftsum + rightsum + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = height(root.left);
        int rightNode = height(root.right);
        int maxHeight = Math.max(leftNode, rightNode) + 1;
        return maxHeight;
    }

    // static int idx = -1;
    // public static Node buildTree(int nodes[]) {
    //     idx++;
    //     if (nodes[idx] == -1) {
    //         return null;
    //     }
    //     Node newNode = new Node(nodes[idx]);
    //     newNode.left = buildTree(nodes);
    //     newNode.right = buildTree(nodes);

    //     return newNode;
    // }
}