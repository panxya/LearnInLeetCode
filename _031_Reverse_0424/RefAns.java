package _031_Reverse_0424;

public class RefAns {
	public static void main(String[] args) {
		
	}
	public static void nextPermutation(int[] nums) {
	      int i = nums.length-2;
	     //找到一个从右往左不再升序i
	      while(i>=0&&nums[i]>=nums[i+1]) {
	    	  i--;
	      }
		
	      if(i>0){
	    	  int j = nums.length-1;
	    	//刚好>nums[i]的
	    	  while(j>=0&&nums[j]<=nums[i]) {
	    		  j--;
	    	  }
	    	  swap(nums,nums[i],nums[j]);
	      }
	      reverse(nums,i+1);
	    }
	private static void reverse(int[]nums ,int start) {
		int j = nums.length-1;int i = start;
		while(i<j) {
			swap(nums,i,j);
			i++;
			j--;
			
		}
	}
	private static void swap(int[] nums, int i, int j) {
		
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
		
	}
}
