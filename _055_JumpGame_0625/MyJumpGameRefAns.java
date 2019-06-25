package _055_JumpGame_0625;

public class MyJumpGameRefAns {
	public static void main(String[] args) {
		int[] n = { 2, 3, 1, 1, 4, 2, 1 };
		System.out.println(canJump(n));
	}

	public static boolean canJump(int[] nums) {
		int end = 0, maxPos = 0;
		for (int i = 0; i < nums.length - 1; i++) {

			if (end < i)
				return false;

			maxPos = Math.max(maxPos, i + nums[i]);

			if (end == i) {
				end = maxPos;
			}

		}

		return maxPos >= nums.length - 1;

	}
}
