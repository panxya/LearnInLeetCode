package _001_Sum2_0324;

public class Day1_Sum2_My {
	public static void main(String[] args) {
		int[] nums = {2,3,4};
		int target = 7;
		int[] s = twoSum(nums,target);
		for(int i :s) {
			System.out.println(s[i]);
		}
		
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					indices[0] = i;
					indices[1] = j;

				}
			}
		}
		return indices;
	}
}
