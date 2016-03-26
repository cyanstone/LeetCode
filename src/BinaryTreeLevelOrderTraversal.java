import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) { val = x; }
	}
	
   public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new LinkedList<List<Integer>>();
		Queue <TreeNode> queue = new LinkedList<TreeNode>();
		
		if(root == null) return result;
		queue.offer(root);
		while(!queue.isEmpty()) {
			int levelNum = queue.size();
			List<Integer> subList = new LinkedList<Integer>();
			for(int i = 0; i < levelNum; i++) {
				if(queue.peek().left != null) queue.offer(queue.peek().left);
				if(queue.peek().right != null) queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			result.add(subList);
		}
		return result;
   }
   public List<List<Integer>> levelOrder2(TreeNode root) {
	   List<List<Integer>> result = new LinkedList<List<Integer>>();
	   List<Integer> subList = new LinkedList<Integer>();
	   Queue queue = new LinkedList<Integer>();
	   queue.offer(root);
	   queue.offer(null);
	   while(!queue.isEmpty()) {
		   TreeNode tmp = (TreeNode) queue.poll();
		  
		   if(tmp != null) {
			   subList.add(tmp.val);
			   if(tmp.left != null) queue.offer(tmp.left);
			   if(tmp.right != null) queue.offer(tmp.right);
		   }  else {
			   if(!subList.isEmpty()){
			   result.add(subList);
			   queue.offer(null);
			   subList.clear();
			   }
		   }
	   }
	   return result;
   }
}
