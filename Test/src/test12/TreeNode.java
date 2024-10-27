package test12;

public class TreeNode {
    public static int SIZE = 25;
    
    char value;
    TreeNode[] nexts;
    
    TreeNode() {
        nexts = new TreeNode[SIZE];
    }
    
    TreeNode(char val) {
        this();
        this.value = val;
    }
    

}
