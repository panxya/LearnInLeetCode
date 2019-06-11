package _002_AddTwoNumber_0325;
/*Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.*/
public class Answer {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
//		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(0);
//		l2.next = new ListNode(6);
//		l2.next.next = new ListNode(4);
		
		ListNode l3 = new ListNode(0);
		l3=addTwoNumbers(l1, l2);

		int[] b = new int[3];
		b[0] = l3.val;
		b[1] = l3.next.val;
		b[2] = l3.next.next.val;

		for (int s : b) {
			System.out.println(b[s]);
		}
	}
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}
}
