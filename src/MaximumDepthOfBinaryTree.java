
public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root){
		int depth = 0;
		if(root != null){
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			depth++;
			if(leftDepth > rightDepth){
				depth = depth + leftDepth;
			} else {
				depth = depth + rightDepth;
			}
		}
		return depth;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int x){
		val = x;
	}
}