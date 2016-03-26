
public class DeleteNodeInALinkedList {

	 public void deleteNode(ListNode node) {
	        if(node == null) return;
	        node.val = node.next.val;
	        node.next = node.next.next;
	    }
	 public static void main(String[] args){
		 DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();
		 ListNode p = new ListNode();
		 ListNode head = new ListNode(1);
		 p = head;
		 for(int i =2; i < 10; i++){
			 ListNode node = new ListNode(i);
			 p.next = node;
			 p = node;
		 }
		 p = head;
		 while(p.next != null){
			 if(p.next.next != null){
				 System.out.print(p.val + " -> " );
			 } else {
				 System.out.print(p.val);
			 }
			 p = p.next;
		 }
	 }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
	ListNode(){
	}
}