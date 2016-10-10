package trees;

import java.io.IOException;

/**
 * Created by pogarg on 10/10/16.
 */
public class TreeMain {

    public static void main(String args[]) throws IOException {
        Tree tree = new Tree();
        Node root = tree.createBalancedBinarySearchTree();

//        TreeTraverse treeTraverse = new TreeTraverse();
//        treeTraverse.borderTraversal(root);

        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor(10, 35, root);
        lowestCommonAncestor.lcaInBinaryTree();

    }
}
