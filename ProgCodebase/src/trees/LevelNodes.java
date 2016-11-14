package trees;

/**
 * Created by pogarg on 11/14/16.
 */
public class LevelNodes {
    int levelToBePrinted;
    LevelNodes(int levelToBePrinted){
        this.levelToBePrinted =levelToBePrinted;
    }

    public void printLevelNodes(Node root, int level)
    {
        if(root==null || level > levelToBePrinted)
            return;
        if(level==levelToBePrinted)
            System.out.print(root.data+",");

        printLevelNodes(root.left, level + 1);
        printLevelNodes(root.right, level + 1);
    }
}
