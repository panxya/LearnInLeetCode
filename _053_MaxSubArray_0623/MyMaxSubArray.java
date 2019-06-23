package _053_MaxSubArray_0623;

public class MyMaxSubArray {
	public static void main(String[] args) {
		int[] nums = { 1 };
		System.out.println(maxSubArray(nums));
	}
//时间复杂度n*n  空间n(?)
	public static int maxSubArray(int[] nums) {
		if (nums.length == 1)
			return nums[0];
		int i = 0;
		int res = nums[0];
		
		while (i < nums.length) {
			int sum = nums[i];
			res = Math.max(res, sum);
			
			for (int n = i + 1; n < nums.length; n++) {
				sum += nums[n];
				res = Math.max(res, sum);
			}
			i++;
		}
		return res;

	}
}
