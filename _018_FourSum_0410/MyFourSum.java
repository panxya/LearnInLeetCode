package _018_FourSum_0410;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MyFourSum {
	public static void main(String[] args) {
		int[] nums = { -1,0,1,2,-1,-4};

		int n =-1;
		List<List<Integer>> list = fourSum(nums, n);
		System.out.println(list);
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < nums.length - 3; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])||((nums[i]==nums[i-1])&&(nums[i]==0))) {
				wf: for (int j = 1; j < nums.length - 2; j++) {
					if (j == 0 || (j > 0 && nums[j] != nums[j - 1])||((nums[j]==nums[j-1])&&(nums[j]==0))) {


						int lo = j + 1;
						int hi = nums.length - 1;
						int sum = target - nums[i] - nums[j];
						while (lo < hi) {
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
			}
		}

		return res;

	}
}
