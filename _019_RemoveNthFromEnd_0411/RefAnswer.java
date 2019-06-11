package _019_RemoveNthFromEnd_0411;

public class RefAnswer {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head ;
		
		ListNode first = dummy;
		ListNode second = dummy;
		//第一指针往前
		for(int i = 1;i<n+1;i++) {
			first=first.next;
		}
		//两指针保持距离同步往前
		while(first.next !=null) {
			first=first.next;
			second=second.next;
		}
		second.next=second.next.next;
		return dummy.next;
	}
}
