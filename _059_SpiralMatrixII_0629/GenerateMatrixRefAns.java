package _059_SpiralMatrixII_0629;

public class GenerateMatrixRefAns {
	/*
	 * Given a positive integer n, generate a square matrix filled with elements
	 * from 1 to n2 in spiral order.
	 */
	public static void main(String[] args) {
		int[][] res = generateMatrix(3);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.printf("%4d", res[i][j]);

			}
			System.out.println();
		}
	}

	public static int[][] generateMatrix(int n) {
		int[][] res = new int[n][n];
		if (n == 0)
			return res;
		// x means row .y means column.
		int xStart = 0;
		int xEnd = n - 1;
		int yStart = 0;
		int yEnd = n - 1;
		int num = 1;
		while (xStart <= xEnd && yStart <= yEnd) {
			for (int i = yStart; i <= yEnd; i++) {
				res[xStart][i] = num++;
			}
			xStart++;

			for (int i = xStart; i <= xEnd; i++) {
				res[i][yEnd] = num++;
			}
			yEnd--;

			for (int i = yEnd; i >= yStart; i--) {
				res[xEnd][i] = num++;
			}
			xEnd--;
			for (int i = xEnd; i >= xStart; i--) {
				if (yStart <= yEnd) {
					res[i][yStart] = num++;
				}
			}
			yStart++;
		}

		return res;

	}
}
