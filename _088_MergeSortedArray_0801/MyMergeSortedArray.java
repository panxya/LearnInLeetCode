package _088_MergeSortedArray_0801;
//ues more memory
public class MyMergeSortedArray {
	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		int m = 3;
		int n = 3;
		merge(nums1, m, nums2, n);
		for(int i =0;i<nums1.length;i++) {
			System.out.print(" "+nums1[i]);
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i = 0;i<n;i++) {
			nums1[m+i]=nums2[i];
		}
		for(int i = 0;i<m+n-1;i++) {
			for(int j = 0;j<m+n-1-i;j++) {
				if(nums1[j]>nums1[j+1]) {
					int temp = nums1[j];
					nums1[j]=nums1[j+1];
					nums1[j+1]=temp;
				}
			}
		}
	}
}
