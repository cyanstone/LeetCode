
public class OddEvenLinkedList {

	private class ListNode {
		int val;
		ListNode next;
		public ListNode(int x) {
			val = x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public ListNode oddEvenList(ListNode head) {
	    if(head != null) {
	    	ListNode odd = head,even = head.next,evenHead = even;
	    	while(even != null && even.next != null) {
	    		odd.next = odd.next.next;
	    		even.next = even.next.next;
	    		odd = odd.next;
	    		even = even.next;
	    	}
	    	odd.next = evenHead;
	    }
	    return head;
	 }
}
