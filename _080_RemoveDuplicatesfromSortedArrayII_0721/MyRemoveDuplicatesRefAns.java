package _080_RemoveDuplicatesfromSortedArrayII_0721;

public class MyRemoveDuplicatesRefAns {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
		int i = removeDuplicates(nums);
		System.out.println(i);
	}

	public static int removeDuplicates(int[] nums) {
		int i = 0;
		for (int x = 0; x < nums.length; x++) {
			if (i < 2 || nums[x] > nums[i - 2]) {
				nums[i++] = nums[x];
			}
		}
		return i;
	}
}
