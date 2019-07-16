package _075_SortColors_0716;

public class SortColorsRefAns {
	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%2d", nums[i]);
		}
	}

	public static void sortColors(int[] nums) {
		int second = nums.length - 1;
		int zero = 0;
		for (int i = 0; i <= second; i++) {
			while (nums[i] == 2 && i < second) {
				swap(nums, i, second--);
			}
			while (nums[i] == 0 && i > zero) {
				swap(nums, i, zero++);
			}
		}
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
