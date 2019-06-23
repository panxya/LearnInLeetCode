package _053_MaxSubArray_0623;

public class RefAns {
	public static void main(String[] args) {
		int[] nums = { 1 };
		System.out.println(maxSubArray(nums));
	}

	private static int maxSubArray(int[] nums) {
		int sum =nums[0];int max = sum;
		for(int i =1;i<nums.length;i++) {
			sum = sum<0?nums[i]:sum+nums[i];
			max = Math.max(max, sum);
		}
		return max;
	}
	
}
