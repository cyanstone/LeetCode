
public class SymmetricTree {

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        else return test(root.left,root.right);
    }
	
	private boolean test(TreeNode left, TreeNode right) {
		if(left == null && right == null) {
			return true;
		} else if(left == null && right != null) {
			return false;
		} else if(left != null && right == null) {
			return false;
		} else if(left != null && right != null && left.val != right.val) {
			return false;
		} else {
			return test(left.left,right.right) && test(left.right,right.left);
		}
	}
}
