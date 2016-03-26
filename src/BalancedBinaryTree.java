
public class BalancedBinaryTree {

	
	  private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isBalanced(TreeNode root) {
	      if(root == null) {
	    	  return true;
	      } else {
	    	  return depth(root) != -1;
	      }
	}
	
	private int depth(TreeNode root){
		if(root == null) {
			return 0;
		} else {
			int leftDepth = depth(root.left);
			int rightDepth = depth(root.right);
			if(leftDepth < 0 || rightDepth < 0 ||
					(leftDepth - rightDepth) < -1 || (leftDepth - rightDepth) > 1) {
				return -1;
			} else if(leftDepth > rightDepth) {
				return leftDepth + 1;
			} else {
				return rightDepth + 1;
			}
		}
	}

}
