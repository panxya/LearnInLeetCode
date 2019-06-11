package _041_FirstMissingPositive_0526;

public class RefSmartAnswer {
public static void main(String[] args) {
		int[] nums = {3,4,-1,1};
		int a = firstMissingPositive(nums);
		System.out.println(a);
	}
	public static int firstMissingPositive(int[] nums) {
		int n = nums.length;
		 for(int i = 0;i<n;++i) {
			 while(nums[i]>0 && nums[i]<=n && nums[i]!=nums[nums[i]-1]) {
				 swap(i,nums[i]-1,nums); 
			 }
		 }
		 for(int i = 0;i<n;++i) {
			 if(nums[i]!=i+1) {
				 return i+1;
			 }
		 }
		 return n +1;
	        
	    }
	private static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
	}
}
