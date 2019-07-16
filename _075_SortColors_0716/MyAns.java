package _075_SortColors_0716;

public class MyAns {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%2d", nums[i]);
		}
	}

	public static void sortColors(int[] nums) {
		int count0 = 0, count1 = 0, count2 = 0;

		// iterate
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count0++;
			} else if (nums[i] == 1) {
				count1++;
			} else {
				count2++;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (count0 != 0) {
				nums[i] = 0;
				count0--;
				continue;
			}
			if (count1 != 0) {
				nums[i] = 1;
				count1--;
				continue;
			}
			if (count2 != 0) {
				nums[i] = 2;
				count2--;
				continue;
			}
		}

	}
}
