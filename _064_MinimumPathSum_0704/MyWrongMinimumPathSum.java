package _064_MinimumPathSum_0704;
// I have done what?
public class MyWrongMinimumPathSum {
	public static void main(String[] args) {
		int[][] n = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		int res = minPathSum(n);
		System.out.println(res);
	}

	private static int minPathSum(int[][] grid) {
		int length = grid[0].length;
		int[] dp = new int[length];
		dp[0] = grid[0][0];
		for (int[] row : grid) {
			for (int i = 0; i < length; i++) {
				if (i > 0) {
					dp[i] += dp[i - 1];
				}
			}
		}

		return dp[length - 1];
	}
}
