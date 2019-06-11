package _025_ReverseKGroup_0418;

import _024_SwapPairs_0417.ListNode;;
/*Given a linked list, 
reverse the nodes of a linked list k at a time and return its modified list.

k is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of k then left-out nodes in the end should
remain as it is.
*/

public class MyRefReverseKGroup {

	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode carry = head;
		int count = 0;
		while (carry != null && count != k) {
			carry = carry.next;
			count++;
		}
		if (count == k) {
			carry = reverseKGroup(carry, k);
			while (count-- > 0) {
				ListNode temp = head.next;
				head.next = carry;
				carry = head;
				head = temp;
			}
			head = carry;
		}
		return head;

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(5);
		ListNode n = reverseKGroup(l1, 2);
		int[] b = new int[5];
		b[0] = n.val;
		b[1] = n.next.val;
		b[2] = n.next.next.val;
		b[3] = n.next.next.next.val;
		b[4] = n.next.next.next.next.val;
		for (int s = 0; s < b.length; s++) {
			System.out.println(b[s]);
		}
	}
}
