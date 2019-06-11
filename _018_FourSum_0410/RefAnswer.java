package _018_FourSum_0410;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RefAnswer {
	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };

		int n = -1;
		List<List<Integer>> list = fourSum(nums, n);
		System.out.println(list);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);

		List<List<Integer>> res = new LinkedList<>();
		if (nums.length < 4)
			return res;
		for (int i = 0; i < nums.length - 3; i++) {
			if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target)
				break; // first candidate too large, search finished
			if (nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3] < target)
				continue; // first candidate too small
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // prevents duplicate result in ans list

			for (int j = i + 1; j < nums.length - 2; j++) {
				if (nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target)
					break; // second candidate too large
				if (nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length - 2] < target)
					continue; // second candidate too small
				if (j > i + 1 && nums[j] == nums[j - 1])
					continue; // prevents duplicate results in ans list

				int lo = j + 1;
				int hi = nums.length - 1;

				while (lo < hi) {
					int sum = target - nums[i] - nums[j];
					if (nums[lo] + nums[hi] == sum) {
						res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
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

		return res;
	}
}