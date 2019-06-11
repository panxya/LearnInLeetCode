package _035_SearchInsert_0430;

public class FalseSearchInsert {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 2;
		int c =searchInsert(nums, target);
		System.out.println(c);
	}
	
	
	
	
	public static int searchInsert(int[] nums, int target) {
		int lo = 0,hi=nums.length-1,mid = 0;
		while(lo<=hi) {
			mid = (lo+hi)/2;
			if(nums[mid]==target) { 
				return mid;
			} else if(nums[mid]>target) {
				hi = mid-1;
			} else {
				lo = mid+1;
			}
			
		}
		
		return lo;
		
	        
	    }
}
