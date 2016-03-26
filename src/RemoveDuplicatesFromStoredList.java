
public class RemoveDuplicatesFromStoredList {

	private class ListNode {
		int val;
		ListNode next;
		ListNode (int x) { val = x;}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode deleteDuplicates(ListNode head){
		
		if(head == null || head.next == null) return head;
		
		ListNode p = head;
		ListNode c = head.next;
		
		while(c != null) {
			ListNode n = c.next;
			if(p.val == c.val) {
				p.next = n;
				c = n;
			} else {
				p = c;
				c = n;
			}
		}
		return head;
	}
}
