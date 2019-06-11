package _019_RemoveNthFromEnd_0411;

import _002_AddTwoNumber_0325.ListNode;

//Given a linked list, remove the n-th node from the end of list and return its head.
public class AnswerRemoveNode {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(0);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = new ListNode(0);
		l3=removeNthFromEnd(l1, 2);

		int[] b = new int[3];
		b[0] = l3.val;
		b[1] = l3.next.val;
		b[2] = l3.next.next.val;

		for (int s : b) {
			System.out.println(b[s]);
		}
	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
//		ListNode dummy = new ListNode(0);
//	    dummy.next = head;
//	    ListNode first = dummy;
//	    ListNode second = dummy;
//	    // Advances first pointer so that the gap between first and second is n nodes apart
//	    for (int i = 1; i <= n + 1; i++) {
//	        first = first.next;
//	    }
//	    // Move first to the end, maintaining the gap
//	    while (first != null) {
//	        first = first.next;
//	        second = second.next;
//	    }
//	    second.next = second.next.next;
//	    return dummy.next;
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    int length  = 0;
	    ListNode first = head;
	    while (first != null) {
	        length++;
	        first = first.next;
	    }
	    length -= n;
	    first = dummy;
	    while (length > 0) {
	        length--;
	        first = first.next;
	    }
	    first.next = first.next.next;
	    return dummy.next;
	    }
}
