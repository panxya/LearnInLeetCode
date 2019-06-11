package _024_SwapPairs_0417;
import _024_SwapPairs_0417.ListNode;
public class Answer {
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		ListNode n=swapPairs(l1);
		int[] b = new int[4];
		b[0] = n.val;
		b[1] = n.next.val;
		b[2] = n.next.next.val;
		b[3] = n.next.next.next.val;
		for (int s : b) {
			System.out.println(b[s]);
		}
	}
	public static ListNode swapPairs(ListNode head) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode current = dummy;
	    while (current.next != null && current.next.next != null) {
	        ListNode first = current.next;
	        ListNode second = current.next.next;
	        first.next = second.next;
	        current.next = second;
	        current.next.next = first;
	        current = current.next.next;
	    }
	    return dummy.next;
	}
}
