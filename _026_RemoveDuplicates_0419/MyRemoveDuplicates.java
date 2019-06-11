package _026_RemoveDuplicates_0419;

public class MyRemoveDuplicates {

	public static void main(String[] args) {
		int[] nums= {1,1,2};
		
		int a = removeDuplicates(nums);
		System.out.println(a);
	}
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length==0) {
			return 0;
		}
		int count = 1;
		out:for(int i =0;i<nums.length;i++) {
			for(int j = i-1;j>=0;j--) {
				if(nums[i]==nums[j]) {
					continue out;
				}
				if(j==0) {
					count++;
				}
			}
		}
		
		
		return count;
		
     //i think i am not wrong.   
    }
}
