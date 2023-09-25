import java.util.*;

class Node {
    int val;
    Node left;
    Node right;

    Node (int d) {
        this.val = d;
    }

    Node (int d , Node left , Node right) {
        this.val = d;
        this.left = left;
        this.right = right;
    }
}

public class Binary_Search_Tree {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int nums[] = {5, 1, 3, 4, 2 ,7};
        Node root = null;

        for (int i=0 ; i<nums.length ; i++) {
            root = insert(root, nums[i]);
        }
        inorder(root);
        System.out.println();

        delete(root, 1);

        inorder(root);
        System.out.println();
    }

    public static Node insert(Node root , int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.val > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static Node delete(Node root , int val) {
        if (root.val > val) {
            root.left = delete(root.left, val);
        } else if (root.val < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //case 3
            Node IS = inordersuccesor(root.right);
            root.val = IS.val;
            root.right = delete(root.right, val);
        }
        return root;
    }

    public static Node inordersuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}
