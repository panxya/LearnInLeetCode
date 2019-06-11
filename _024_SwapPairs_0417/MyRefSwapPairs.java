package _024_SwapPairs_0417;

import _024_SwapPairs_0417.ListNode;

/*Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.
*/
public class MyRefSwapPairs {
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
		for(int s =0;s<b.length;s++) {
			System.out.println(b[s]);
		}
	}

	public static ListNode swapPairs(ListNode head) {
		
		ListNode result = new ListNode(0);
		result.next=head;
		ListNode carry  = result;
		
		while (carry.next!=null&&carry.next.next != null) {
			ListNode first = carry.next;
			
			ListNode second = carry.next.next;
			first.next=second.next;
			carry.next = second;
			carry.next.next=first;
			
			carry = carry.next.next;
		}

		return result.next;

	}
}
