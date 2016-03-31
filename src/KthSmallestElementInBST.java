import java.util.ArrayList;
import java.util.Stack;


public class KthSmallestElementInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int KthSmallest(TreeNode root ,int k) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode currentNode = root;
		int count = 0;
		while(currentNode != null || !stack.isEmpty()) {
			if( currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.left;
			} else {
				TreeNode node = stack.pop();
				if(++count == k) return node.val;
				currentNode = node.right;
			}
		}
		return Integer.MIN_VALUE;
	}

}
