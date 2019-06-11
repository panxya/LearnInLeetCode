package _039_CombinationSum_0504;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyRefAns {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> list = combinationSum(nums, target);
		for (List<Integer> num : list) {
			for (int n : num) {
				System.out.print(n);

			}
			System.out.println();
		}
	}

	private static List<List<Integer>> combinationSum(int[] nums, int target) {
		List<List<Integer>> list = new ArrayList();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<Integer>(), nums, target, 0);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, ArrayList<Integer> arrayList, int[] nums, int target,
			int i) {
		if (target < 0)
			return;
		else if (target == 0)
			list.add(new ArrayList<>(arrayList));
		else {
			for (int j = i; j < nums.length; j++) {
				arrayList.add(nums[j]);
				backtrack(list, arrayList, nums, target - nums[j], j);
				arrayList.remove(arrayList.size() - 1);
			}
		}
	}
}
