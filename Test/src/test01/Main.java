package test01;

import java.util.Stack;

public class Main {
	
	public static String DFS(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		StringBuilder traceDFS = new StringBuilder();
		traceDFS.append("[");
		
		if (root == null) {
			traceDFS.append("]");
			return traceDFS.toString();
		}
		
		stack.push(root);
		int[] count = {-1, -1}; // count[0] is for count height of left, count[1] is for count height of right
		int index = 0;
		int hashCodeLeft = -1;
		if (root.left != null) {
			hashCodeLeft = root.left.hashCode();
		}
		int hashCodeRight = -1;
		if (root.right != null) {
			hashCodeRight = root.right.hashCode();
		}
		while (!stack.empty()) {
			TreeNode node = stack.pop();
			if (node.hashCode() == hashCodeLeft) {
				index = 0;
			}
			if (node.hashCode() == hashCodeRight) {
				index = 1;
			}
			count[index]++;
			traceDFS.append(node.val + ", ");
			System.out.println("val = " + node.val + " count[" + index + "] = " + count[index]);
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
			
		}
		traceDFS.replace(traceDFS.length() - 2, traceDFS.length() - 1, "]");
		
		System.out.println("height of left side = " + count[0]);
		System.out.println("height of right side = " + count[1]);
		
		return traceDFS.toString();
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2); root.right = new TreeNode(3);
		root.left.left = new TreeNode(4); root.left.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		root.right.right.left = new TreeNode(7);
		
		System.out.println(DFS(root));
		
		String str;
		str.to
	}
}
