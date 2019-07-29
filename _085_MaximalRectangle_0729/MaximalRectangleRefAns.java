package _085_MaximalRectangle_0729;

import java.util.Arrays;

public class MaximalRectangleRefAns {
	public static void main(String[] args) {
//		char[][] matrix = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
//				{ '1', '0', '0', '1', '0' } };
//		char[][] matrix = { { '1' } };
		char[][] matrix = { { '0', '0', '0', '1', '0', '0', '0' }, { '0', '0', '1', '1', '1', '0', '0' },
				{ '0', '1', '1', '1', '1', '1', '0' }, };
		System.out.println(maximalRectangle(matrix));
	}

	public static int maximalRectangle(char[][] matrix) {
		if (matrix.length == 0 || matrix == null)
			return 0;
		int m = matrix.length;
		int n = matrix[0].length;
		int[] left = new int[n];
		int[] right = new int[n];
		int[] height = new int[n];
		Arrays.fill(left, 0);
		Arrays.fill(right, n);
		Arrays.fill(height, 0);
		int maxA = 0;
		for (int i = 0; i < m; i++) {
			int cur_left = 0, cur_right = n;
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == '1') {
					height[j]++;
				} else {
					height[j] = 0;
				}
			}
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == '1') {
					left[j] = Math.max(left[j], cur_left);
				} else {
					left[j] = 0;
					cur_left = j + 1;
				}
			}
			for (int j = n - 1; j >= 0; j--) {
				if (matrix[i][j] == '1') {
					right[j] = Math.min(right[j], cur_right);
				} else {
					right[j] = n;
					cur_right = j;
				}
			}
			for (int j = 0; j < n; j++) {
				maxA = Math.max(maxA, (right[j] - left[j]) * height[j]);
			}
		}
		return maxA;

	}
}
