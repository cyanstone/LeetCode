import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new LinkedList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode currentNode = root;
		if(currentNode == null) return result;
		while(currentNode != null || !stack.isEmpty()) {
			while(currentNode != null){
				stack.push(currentNode);
				currentNode = currentNode.left;
			}
			currentNode = stack.pop();
			result.add(currentNode.val);
			currentNode = currentNode.right;
		}
		return result;
	}

}
