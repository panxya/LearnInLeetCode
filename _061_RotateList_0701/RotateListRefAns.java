package _061_RotateList_0701;

import _002_AddTwoNumber_0325.ListNode;

/*Given a linked list, rotate the list to the right by k places, 
 * where k is non-negative.

Example 1:

Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL
Explanation:
rotate 1 steps to the right: 5->1->2->3->4->NULL
rotate 2 steps to the right: 4->5->1->2->3->NULL

Ex: {1,2,3} k=2 Move the list after the 1st node to the front   {2,3,1}*/
public class RotateListRefAns {
	
	public static void main(String[] args) {
		class List1Node {
		     int val;
		     ListNode next;
		     void ListNode(int x) { val = x; }
		  }
	
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		l1.next.next = new ListNode(3);
		
		
		ListNode l3 = new ListNode(0);
		l3=rotateRight(l1, 2);

		int[] b = new int[3];
		b[0] = l3.val;
		b[1] = l3.next.val;
		b[2] = l3.next.next.val;

		for (int s=0;s<3;s++) {
			System.out.println(b[s]);
		}
	}
	
	
	 public static ListNode rotateRight(ListNode head, int k) {
		if(head==null||head.next==null) return head;
		ListNode dummy = new ListNode(0);
		dummy.next=head;
		ListNode fast = dummy,slow =dummy;
		int i ;
		for(i=0;fast.next!=null;i++) {
			fast = fast.next;//total length
		}
		for(int j = i-k%i;j>0;j--) {
			slow=slow.next;//Get the i-n%i th node
		}
		
		fast.next =dummy.next;//Do the rotation
		dummy.next=slow.next;
		slow.next=null;
		
		 
		 return dummy.next;
	        
	    }
}
