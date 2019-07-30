package _086_PartitionList_0730;

import _002_AddTwoNumber_0325.ListNode;

public class PartitionListRefAns {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(4);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(2);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(2);
		int x = 3;
		ListNode res = partition(head,x);
		for(ListNode l = head;l!=null;l=l.next) {
			System.out.println(l.val);
		}
		
	}
	public static ListNode partition(ListNode head, int x) {
		ListNode smallerHead = new ListNode(0),biggerHead = new ListNode(0);
		ListNode smaller = smallerHead,bigger = biggerHead;
		while(head!=null) {
			if(head.val<x) {
				smaller = smaller.next=head;
			}else {
				bigger = bigger.next=head;
			}
			head = head.next;
		}
		smaller.next = biggerHead.next;
		bigger.next = null;
		
		return smallerHead.next;

	}
}
