package _034_FindFirstAndLast_0427;

public class MyFindFirstAndLastFalse {
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target=7; 
		int res[] =  searchRange(nums,target);
//		System.out.println(res[0]);
//		System.out.println(res[1]);
		for(int n :res) {
			System.out.println(n);
		}
	}

	private static int[] searchRange(int[] nums, int target) {
		int[] num = new int[2];
		int l=0,r=nums.length-1,m=0;
		
		while(l<=r) {
			
			
			
			if(nums[l]==target) {
				num[0]=l;
			}
			
			
			if(nums[r]==target) {
				num[1]=r;
			}
		
				l++;	
				r--;
			
		}
		
		if(nums[num[0]]!=target) {
			num[0]=-1;
			num[1]=-1;
		}
		
		
		return num;
	}
	
}
