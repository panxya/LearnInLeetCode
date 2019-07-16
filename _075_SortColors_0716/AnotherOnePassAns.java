package _075_SortColors_0716;

public class AnotherOnePassAns {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%2d", nums[i]);
		}
	}

	private static void sortColors(int[] nums) {
		int n = nums.length;
		int n0 = -1, n1 = -1, n2 = -1;
		for (int i = 0; i < n; ++i) {
			if (nums[i] == 0) {
				nums[++n2] = 2;
				nums[++n1] = 1;
				nums[++n0] = 0;
			} else if (nums[i] == 1) {
				nums[++n2] = 2;
				nums[++n1] = 1;
			} else if (nums[i] == 2) {
				nums[++n2] = 2;
			}
		}

	}
}
