package _023_MergeKLists_0416;

import _021_MergeTwoLists_0413.ListNode;

public class MyMergeKLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		ListNode[] lists = {l1,l2,l3};
		ListNode n = mergeKLists(lists);
		int[] b = new int[8];
		b[0] = n.val;
		b[1] = n.next.val;
		b[2] = n.next.next.val;
		b[3] = n.next.next.next.val;
		b[4] = n.next.next.next.next.val;
		b[5] = n.next.next.next.next.next.next.val;
		b[6] = n.next.next.next.next.next.next.next.val;
		
		for (int s : b) {
			System.out.println(b[s]);
		}
	}
	
public static ListNode mergeKLists(ListNode[] lists) {
	ListNode results = null;	
	for(int i =0;i<lists.length;i++) {
		results = mergeTwoLists(results,lists[i]);
    }
	return results;
}
public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	if(l1==null&&l2==null) {
		return null;
	}
	
	ListNode result = new ListNode(0);	
	ListNode carry = result;
	while(l1!=null||l2!=null) {
		if(l1==null) {
			carry.next=new ListNode(l2.val);
			carry=carry.next;
			l2=l2.next;
		}else if(l2==null) {
			carry.next =new ListNode(l1.val);
			carry=carry.next;
			l1=l1.next;
		}else if(l1.val>l2.val) {
			carry.next =new ListNode(l2.val);
			carry=carry.next;
			l2=l2.next;
		}else {
			carry.next =new ListNode(l1.val);
			carry=carry.next;
			l1=l1.next;
		}
	}
	return result.next;
	
    }
}

