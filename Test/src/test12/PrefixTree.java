package test12;

public class PrefixTree {
    
    TreeNode root;
    
    PrefixTree() {
        root = new TreeNode();
    }
    
    public void insert(String word) {
        TreeNode node = root;
        int index = 0;
        char chr = word.charAt(index);
        while (true) {
            if (node.nexts[chr - 'a'] == null) {
                break;
            }
            if (index == word.length()) {
                node.nexts[24] = new TreeNode('*');
                return;
            }
            node = node.nexts[chr - 'a'];
            chr = word.charAt(++index);
        }
        
        while (true) {
            TreeNode newNode = new TreeNode(chr);
            node.nexts[chr - 'a'] = newNode;
            node = newNode;
            if (++index == word.length()) {
                node.nexts[24] = new TreeNode('*');
                break;
            }
            chr = word.charAt(index);
        }
        return;
    }
    
    public void printBranch(String word) {
        int index = 0;
        char chr = word.charAt(index);
        TreeNode node = root.nexts[chr - 'a'];
        while (true) {
            System.out.println(node.value);
            for (TreeNode n: node.nexts) {
                if (n != null) {
                    System.out.print(n.toString() + " ");
                }
            }
            if (index++ == word.length()) {
                break;
            }
            chr = word.charAt(index);
            
            node = node.nexts[chr - 'a'];
        }
    }
    
    public static void main(String[] args) {
        PrefixTree tree = new PrefixTree();
        tree.insert("many");
        tree.printBranch("many");
    }
}
