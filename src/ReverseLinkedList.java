
public class ReverseLinkedList {
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode p = head.next;
        pre.next = null;
        ListNode next;
        while( p != null) {
        	next = p.next;
        	p.next = pre;
        	pre = p;
        	p = next;
        }
        return pre;
    }
}
