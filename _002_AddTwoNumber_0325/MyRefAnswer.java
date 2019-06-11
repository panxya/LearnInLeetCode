package _002_AddTwoNumber_0325;

public class MyRefAnswer {
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode p = l1,q=l2,carry=result;
		int car=0;
		while(p != null||q!= null) {
			int x = p!=null?p.val:0;
			int y = q!=null?p.val:0;
			int sum = x+y+car;
			car = sum/10;
			carry.next= new ListNode(sum%10);
			carry=carry.next;
			if(p!=null) {
				p=p.next;
			}
			if(q!=null) {
				q=q.next;
			}
		}
		if(car>0) {
			carry.next= new ListNode(car);
		}
		return result.next;	
	}
}
