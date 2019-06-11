package _002_AddTwoNumber_0325;

import java.util.HashMap;
import java.util.Map;

public class MyAddTwoNumber {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		ListNode l3 = new ListNode(0);
		l3=addTwoNumbers( l1,  l2);

		int[] b = new int[3];
		b[0] = l3.val;
		b[1] = l3.next.val;
		b[2] = l3.next.next.val;

		for (int s : b) {
			System.out.println(b[s]);
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		HashMap<Integer, Integer> hm = new HashMap<>();
		HashMap<Integer, Integer> hm2 = new HashMap<>();
		ListNode l4=l3;
		int x = 0;
		int y = 0;

		while (l1 != null) {
			hm.put(x, l1.val);

			l1 = l1.next;
			x++;
		}

		while (l2 != null) {
			hm2.put(y, l2.val);
			l2 = l2.next;
			y++;

		}

		int a[] = new int[1 + Math.max(hm.size(), hm2.size())];
		int i = 0;

		while (i <= hm.size() || i <= hm2.size()) {

			if (hm.get(i) != null) {
				a[i] += hm.get(i);
			}
			if (hm2.get(i) != null) {
				a[i] += hm2.get(i);
			}
			if (a[i] >= 10) {
				a[i] %= 10;
				a[i + 1] = 1;
			}
			i++;
		}
		if (a[a.length - 1] == 0) {
			int b[] = new int[a.length - 1];
			for (int k=0;k<b.length;k++) {
				b[k] = a[k];
			}

			l4= nextNode(b.length - 1, b);
		} else {
			l4= nextNode(a.length - 1, a);
		}
			return l3.next;
	}

	public static ListNode nextNode(int j, int[] a) {

		if (j == 0) {
			return new ListNode(a[0]);
		} else {
			return nextNode(j-1, a).next = new ListNode(a[j]);
		}
	}
}
