import java.util.*;
class Nodes {
    int data;
    Nodes left;
    Nodes right;

    Nodes (int d) {
        this.data = d;
        this.left = null;
        this.right = null;
    }
}

class Trees {
    static int idx = -1;
    public Nodes creatingTree(int[]Array) {
        idx++;
        if (Array[idx] == -1) {
            return null;
        }
        Nodes newNode = new Nodes(Array[idx]);
        newNode.left = creatingTree(Array);
        newNode.right = creatingTree(Array);

        return newNode;
    }

    public void preorder(Nodes root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Nodes root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Nodes root) {
        if (root == null) {
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }

    public int numberOfNodes(Nodes root) {
        if (root == null) {
            return 0;
        }
        int leftNode = numberOfNodes(root.left);
        int rightNode = numberOfNodes(root.right);
        return leftNode + rightNode + 1;
    }

    public int sumOfNodes(Nodes root) {
        if (root == null) {
            return 0;
        }
        int leftNodeSum = sumOfNodes(root.left);
        int rightNodeSum = sumOfNodes(root.right);
        return leftNodeSum + rightNodeSum + root.data;
    }

    public int height(Nodes root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = height(root.left);
        int rightNodes = height(root.right);
        int maxheight = Math.max(leftNodes, rightNodes) + 1;

        return maxheight;
    }

    public void levelOfOrder(Nodes root) {

        Queue<Nodes> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Nodes currNodes = q.remove();
            if (currNodes == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNodes.data + " ");
                if (currNodes.left != null) {
                    q.add(currNodes.left);
                }
                if (currNodes.right != null) {
                    q.add(currNodes.right);
                }
            }
        }
    }
}

public class test {
    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Trees t = new Trees();    
        Nodes root = t.creatingTree(node);
        
        t.levelOfOrder(root);
    }
}
