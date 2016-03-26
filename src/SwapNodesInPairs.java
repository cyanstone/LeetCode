
public class SwapNodesInPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) return head;
		ListNode n = head.next;
		head.next = swapPairs(head.next.next);
		n.next = head;
		return n;
	}

	public ListNode swapPairs2(ListNode head){
		if(head == null || head.next == null)
	        return head;
	    ListNode cur = head, pre = null;
	    head = cur.next;
	    while(cur != null && cur.next!=null) {
	        ListNode nxt = cur.next;
	        cur.next = nxt.next;
	        nxt.next = cur;
	        if(pre != null) 
	            pre.next = nxt;
	        pre = cur;
	        cur = cur.next;
	    }
	    return head;
	}
}
