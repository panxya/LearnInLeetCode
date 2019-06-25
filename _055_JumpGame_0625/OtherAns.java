package _055_JumpGame_0625;

public class OtherAns {
	public static void main(String[] args) {
		int[] n = { 2, 3, 1, 1, 4, 2, 1 };
		System.out.println(canJump(n));
	}

	public static boolean canJump(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0 && max <= i) {
				return false;
			}
			max = Math.max(max, i + nums[i]);
		}

		return true;

	}
}
