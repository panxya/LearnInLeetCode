package _082_RemoveDuplicatesfromSortedListII_0725;

import _002_AddTwoNumber_0325.ListNode;

public class RemoveDuplicatesfromSortedListIIRefAns {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next.next = new ListNode(5);
		ListNode res = deleteDuplicates(head);
		int[] b = new int[3];
		b[0] = res.val;
		b[1] = res.next.val;
		b[2] = res.next.next.val;

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return null;
		if (head.next != null && head.val == head.next.val) {
			while (head.next != null && head.val == head.next.val) {
				head = head.next;
			}
			return deleteDuplicates(head.next);
		} else {
			head.next = deleteDuplicates(head.next);
		}
		return head;

	}
}
