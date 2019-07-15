package _074_Searcha2DMatrix_0715;

public class MySearcha2DMatrix {
	public static void main(String[] args) {
		int[][] matrix = {
//				{1,   3,  5,  7},
//				  {10, 11, 16, 20},
//				  {23, 30, 34, 50}
				{ 1 } };

		int target = 1;
		System.out.println(searchMatrix(matrix, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix[0].length == 0)
			return false;

		boolean flag = false;
		int n = matrix.length;
		int m = matrix[0].length;
		wc: for (int i = 0; i < n; i++) {
			if (matrix[i][m - 1] >= target) {
				for (int j = 0; j < m; j++) {
					if (matrix[i][j] == target) {
						flag = true;
						break wc;
					}
				}
			}
		}

		return flag;

	}
}
