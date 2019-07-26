package _083_RemoveDuplicatesfromSortedList_0726;

import _002_AddTwoNumber_0325.ListNode;

public class Ans {
	private static ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.next.val == current.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}
}
