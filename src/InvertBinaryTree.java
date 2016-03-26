
public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public TreeNode invertTree(TreeNode root) {
	        if(root == null) return root;
	        if(root.left != null || root.right != null){
	            TreeNode temp = root.left;
	            root.left = root.right;
	            root.right = temp;
	            invertTree(root.left);
	            invertTree(root.right);
	        }
	        return root;
	    }

	 class TreeNode {
		    int val;
		    TreeNode left;
		    TreeNode right;
		    TreeNode(int x) { val = x; }
		 }

}
