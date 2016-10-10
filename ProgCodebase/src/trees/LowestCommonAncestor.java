package trees;

import java.util.ArrayList;
import java.util.List;

import common.Util;

/**
 * Created by pogarg on 10/10/16.
 */
public class LowestCommonAncestor {
    private int v1;
    private int v2;
    private Node root;
    private boolean flag = false;

    LowestCommonAncestor(int v1, int v2, Node root) {
        this.v1 = v1;
        this.v2 = v2;
        this.root = root;
    }

    public void lcaInBinaryTree() {
        List<Integer> nodesAlongThePathOfV1 = new ArrayList<Integer>();
        List<Integer> nodesAlongThePathOfV2 = new ArrayList<Integer>();

        search(root, v1, nodesAlongThePathOfV1);
        resetRecursionVariables();
        search(root, v2, nodesAlongThePathOfV2);

//        Util.printList(nodesAlongThePathOfV1);
//        Util.printList(nodesAlongThePathOfV2);

        int ancestor = findAncestor(nodesAlongThePathOfV1,nodesAlongThePathOfV2);
        if(ancestor == -1) {
            System.out.print("There is no common ancestor.");
        } else {
            System.out.print(ancestor + " is the lowest common ancestor of " + v1 + " and " + v2);
        }
    }

    private void search(Node root, int val, List<Integer> nodesAlongThePath) {
        if(root == null || flag) {
            return;
        }

        if(root.data == val) {
            flag = true;
            return;
        }

        nodesAlongThePath.add(root.data);
        //Util.printList(nodesAlongThePath);
        search(root.left, val, nodesAlongThePath);
        search(root.right, val, nodesAlongThePath);

        if (!flag)
            nodesAlongThePath.remove(nodesAlongThePath.size() - 1);
    }

    private int findAncestor(List<Integer> nodesAlongThePathOfV1, List<Integer> nodesAlongThePathOfV2) {
        int ans = -1;
        for (Integer i: nodesAlongThePathOfV1) {
            if( nodesAlongThePathOfV2.contains(i))
                ans = i;
        }
        return ans;
    }


    /**
     * To fin Lowest common ancestor in BST can be same as Binary Tree
     *  or it could be done in a much simpler manner
     **/
    public void lcaInBinarySearchTree() {

    }

    private void resetRecursionVariables() {
        flag = false;
    }
}
