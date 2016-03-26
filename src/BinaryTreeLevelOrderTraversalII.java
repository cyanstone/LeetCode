import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) { val = x; }
	}
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
	    LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
	    Queue<TreeNode> queue = new LinkedList<TreeNode>();
	    
	    if(root == null) return result;
	    queue.offer(root);
	    while(!queue.isEmpty()) {
	    	int levelNum = queue.size();
	    	List<Integer> subList = new LinkedList<Integer>();
	    	for(int i = 0; i < levelNum; i++) {
	    		if(queue.peek().left != null) queue.offer(queue.peek().left);
	    		if(queue.peek().right != null ) queue.offer(queue.peek().right);
	    		subList.add(queue.poll().val);
	    	}
	    	 result.addFirst(subList);
	    }
	    return result;
	}

}
