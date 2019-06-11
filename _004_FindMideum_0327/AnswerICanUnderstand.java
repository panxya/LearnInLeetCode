package _004_FindMideum_0327;

public class AnswerICanUnderstand {
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = { 3,4 };

		double c = findMedianSortedArrays(a, b);
		System.out.println(c);
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {  
		int m = nums1.length;
		int	n=nums2.length;
		int index =0,index1=0,index2=0;
		double result = 0;
		int nums[] =new int[m+n];
		if(m==0) {
			return findMid(nums2);
		}else if(n==0){
			return findMid(nums1);
		}else {
		
		
		while(index1<m&&index2<n) {
			if(nums1[index1]<nums2[index2]) {
				nums[index++]=nums1[index1++];
			}else {
				nums[index++]=nums2[index2++];
			}	
		}
		
		while(index1<m) {
			nums[index++]=nums1[index1++];
		}
		
		while(index2<n) {
			nums[index++]=nums2[index2++];
		}
			
		return findMid(nums);
		}
	}
	private static double findMid(int[] nums1) {
		if(nums1.length%2==0) {
			return (nums1[nums1.length/2]+nums1[nums1.length/2-1])/2.0;//��������2
		}else {
			return nums1[nums1.length/2];
		}
	}
}
