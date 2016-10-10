package trees;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Created by pogarg on 10/10/16.
 */
public class TreeTraverse {
    
    public void preOrderTraversal(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public void postOrderTraversal(Node root) {
        if (root == null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public void inOrderTraversal(Node root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        if (root !=null)
            queue.add(root);

        while (!queue.isEmpty()) {
            Node n = queue.remove();

            System.out.print(n.data + " ");

            if (n.left != null)
                queue.add(n.left);

            if (n.right != null)
                queue.add(n.right);
        }
    }

    public void borderTraversal(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        printLeftBorder(root.left);
        printLeaves(root);
        printRightBorder(root.right);
    }

    public void printLeftBorder(Node root) {

        if (root.left == null && root.right == null) {
            return;
        }

        System.out.print(root.data + " ");

        if(root.left != null)
            printLeftBorder(root.left);
        else
            printLeftBorder(root.right);
    }

    public void printLeaves(Node root) {
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }

        if (root.left != null)
         printLeaves(root.left);

        if (root.right != null)
         printLeaves(root.right);
    }

    public void printRightBorder(Node root) {
        if (root.left == null && root.right == null) {
            return;
        }

        if(root.right != null)
            printRightBorder(root.right);
        else
            printRightBorder(root.left);

        System.out.print(root.data + " ");
    }
}
