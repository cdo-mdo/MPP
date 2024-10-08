package test03;

import java.util.List;

public class RightSideView {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		root1.right.left = new TreeNode(6);
		root1.right.right = new TreeNode(7);
		
		List<Integer> res = TreeNode.rightSideView(root1);
		System.out.println(res.toString());
		
		TreeNode root2 = new TreeNode(1);
		root2.left = null;
		root2.right = new TreeNode(2);
		res = TreeNode.rightSideView(root2);
		System.out.println(res.toString());
	}
}
