package _016_ThreeSumClosest_0408;

import java.util.Arrays;

public class MyThreeSumClosest {
	public static void main(String[] args) {
		int[] nums = { -1, 2, 1, -4 };
		int i = threeSumClosest(nums, 1);
		System.out.println(i);
	}

	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		for (int i = 0; i < nums.length - 2; i++) {
			int lo = i + 1;
			int hi = nums.length - 1;

			while (lo < hi) {
				int sum = nums[i] + nums[hi] + nums[lo];
				if (sum < target) {
					lo++;
				} else {
					hi--;
				}
				if (Math.abs(sum - target) < Math.abs(result - target)) {
					result = sum;
				}
			}
		}
		return result;

	}
}
