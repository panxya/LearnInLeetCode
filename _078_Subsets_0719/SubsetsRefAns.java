package _078_Subsets_0719;

import java.util.ArrayList;
import java.util.List;

public class SubsetsRefAns {
	public static void main(String[] args) {

	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void backtrack(List<List<Integer>> list, ArrayList tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
