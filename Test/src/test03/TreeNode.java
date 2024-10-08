package test03;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	
	TreeNode() {
	}
	
	TreeNode(int val) {
		this.val = val;
	}
	
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static List<Integer> rightSideView(TreeNode root) {
		if (root == null) {
			return new ArrayList<Integer>();
		}
		List<Integer> res = new ArrayList<>();
		TreeNode node = root;
		while (node != null) {
			res.add(node.val);
			node = node.right;
		}
		return res;
	}
}
