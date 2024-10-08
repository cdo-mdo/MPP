package test04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
	public class NodeWithIndex extends TreeNode {
		int index;
		
		NodeWithIndex(int val, int index) {
			super(val);
			this.index = index;
		}
		
		NodeWithIndex(int val, int index, TreeNode left, TreeNode right) {
			super(val, left, right);
			this.index = index;
		}
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return null;
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		Queue<TreeNode> queue = new LinkedList<>();
		int index = 1;
		queue.add(new NodeWithIndex(root.val, index, root.left, root.right));
		
		List<Integer> list = new ArrayList<>();
		while (!queue.isEmpty()) {
			NodeWithIndex node = (NodeWithIndex)queue.remove();
			if (node.index != index) {
				
			}
		
		
		
		
		return res;
	}

	
}
