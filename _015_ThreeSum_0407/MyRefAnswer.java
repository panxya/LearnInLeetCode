package _015_ThreeSum_0407;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyRefAnswer {
	public static void main(String[] args) {
		int[] nums = { 1, 0, 1, 2, -1, -4 };
		List<List<Integer>> list = threeSum(nums);
		System.out.println(list);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new LinkedList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || i > 0 && nums[i] != nums[i - 1]) {
				int lo = i + 1;
				int hi = nums.length - 1;
				int sum = 0 - nums[i];
				while (lo < hi) {
					if (nums[lo] + nums[hi] == sum) {
						list.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
						while (lo < hi && nums[lo] == nums[lo + 1])
							lo++;
						while (lo < hi && nums[hi] == nums[hi - 1])
							hi--;
						lo++;
						hi--;
					} else if (nums[lo] + nums[hi] < sum) {
						lo++;
					} else {
						hi--;
					}
				}
			}
		
		}
	return list;
	}
}
