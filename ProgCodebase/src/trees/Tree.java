package trees;

/**
 * Created by pogarg on 10/10/16.
 */
public class Tree {
    public Node createBinarySearchTree(boolean isBalanced) {
        if (isBalanced) {
            return createBalancedBinarySearchTree();
        } else {
            return createUnbalancedBinarySearchTree();
        }
    }

    public Node createUnbalancedBinarySearchTree() {
        Node root = new Node(50);
        root.left = new Node(20);
        root.right = new Node(70);

        //left subtree of root
        root.left.right = new Node(30);

        root.left.right.left = new Node(25);

        //right subtree of root
        root.right.left = new Node(60);
        root.right.right = new Node(75);

        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);

        return root;
    }

    public Node createBalancedBinarySearchTree() {
        Node root = new Node(50);
        root.left = new Node(20);
        root.right = new Node(70);

        //left subtree of root
        root.left.left = new Node(10);
        root.left.right = new Node(30);

        root.left.left.left = new Node(5);
        root.left.left.right = new Node(15);

        root.left.right.left = new Node(25);
        root.left.right.right = new Node(35);

        //right subtree of root
        root.right.left = new Node(60);
        root.right.right = new Node(75);

        root.right.left.left = new Node(55);
        root.right.left.right = new Node(65);

        return root;
    }

    public Node createBinaryTree() {
        Node root = new Node(50);
        root.left = new Node(80);
        root.right = new Node(70);

        //left subtree of root
        root.left.left = new Node(10);
        root.left.right = new Node(60);

        root.left.left.left = new Node(55);
        root.left.left.right = new Node(35);

        root.left.right.left = new Node(25);
        root.left.right.right = new Node(45);

        //right subtree of root
        root.right.left = new Node(60);
        root.right.right = new Node(5);

        root.right.left.left = new Node(65);
        root.right.left.right = new Node(85);

        return root;
    }
}

class Node {
    int data;
    Node right;
    Node left;

    Node(int value){
        data = value;
        left = null;
        right = null;
    }
}
