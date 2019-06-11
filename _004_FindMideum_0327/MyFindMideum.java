package _004_FindMideum_0327;

import java.util.HashSet;

public class MyFindMideum {

	public static void main(String[] args) {
		int[] a = {};
		int[] b = { 21, 12, 33, 56, 33 };

		double c = findMedianSortedArrays(a, b);
		System.out.println(c);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double c = 0;

		if (nums1.length!=0&&nums2.length!=0) {
			int max = nums1[0];
			int min = nums1[0];
			for (int i = 0; i < nums1.length; i++) {
				max = (nums1[i] > max) ? nums1[i] : max;
				min = (nums1[i] < min) ? nums1[i] : min;
			}
			for (int i = 0; i < nums2.length; i++) {
				max = (nums2[i] > max) ? nums2[i] : max;
				min = (nums2[i] < min) ? nums2[i] : min;
			}

			c = (max + min) / 2;

			return c;
		} else if(nums1.length==0&&nums2.length!=0) {
			int max = nums2[0];
			int min = nums2[0];
			for (int i = 0; i < nums2.length; i++) {
				max = (nums2[i] > max) ? nums2[i] : max;
				min = (nums2[i] < min) ? nums2[i] : min;
			}

			c = (max + min) / 2;
			return c;
		}else {
			return 0;
		}

	}
}
