import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    
	public List<Integer> preorderTraversal(TreeNode node) {
		List<Integer> result = new LinkedList<Integer>();
		Stack<TreeNode> rights = new Stack<TreeNode>();
		while(node!= null) {
			result.add(node.val);
			if(node.right != null) {
				rights.push(node.right);
			}
			node = node.left;
			if(node == null && !rights.isEmpty()) {
				node = rights.pop();
			}
		}
		return result;
	}
}
