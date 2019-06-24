package _054_SpiralOrder_0624;

import java.util.ArrayList;
import java.util.List;

public class MySpiralOrderRefAns {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		List list = spiralOrder(matrix);
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%2d", list.get(i));
		}
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ans = new ArrayList<>();
		if (matrix.length == 0)
			return ans;

		int xStart = 0, yStart = 0, direction = 0, // 0向右，1向下，2向左，3向上
				topBorder = -1, rightBorder = matrix[0].length, bottomBorder = matrix.length, leftBorder = -1;
		while (true) {
			if (ans.size() == (matrix[0].length * matrix.length)) {
				return ans;
			}
			ans.add(matrix[yStart][xStart]);
			switch (direction) {
			// to right
			case 0:
				if (xStart + 1 == rightBorder) {
					direction = 1;
					yStart += 1;
					topBorder += 1;
				} else {
					xStart += 1;
				}
				break;
			case 1:
				if (yStart + 1 == bottomBorder) {
					direction = 2;
					xStart -= 1;
					rightBorder -= 1;
				} else {
					yStart += 1;
				}
				break;
			case 2:
				if (xStart - 1 == leftBorder) {
					direction = 3;
					yStart -= 1;
					bottomBorder -= 1;
				} else {
					xStart -= 1;
				}
				break;
			case 3:
				if (yStart - 1 == topBorder) {
					direction = 0;
					xStart += 1;
					leftBorder += 1;
				} else {
					yStart -= 1;
				}
				break;
			}
		}

	}
}
