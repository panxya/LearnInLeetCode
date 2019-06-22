package _052_NQueensII_0621;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyNQueensII {
	public static void main(String[] args) {
		int n = 4;
		int x = totalNQueens(n);
		System.out.println(x);

	}

	public static int totalNQueens(int n) {
		List<List<String>> ans = new ArrayList<>();

		permutations(0, n, new int[n], ans);
		return ans.size();

	}

	private static void permutations(int row, int n, int[] trace, List<List<String>> ans) {
		for (int i = 0; i < n; i++) {
			if (check(row, i, trace)) {
				trace[row] = i;

				if (row != n - 1) {
					permutations(row + 1, n, trace, ans);
					continue;
				}
				List<String> answer = new ArrayList<>(trace.length);
				char[] r = new char[n];
				for (int j = 0; j < trace.length; j++) {
					Arrays.fill(r, '.');
					r[trace[j]] = 'Q';
					answer.add(new String(r));
				}
				ans.add(answer);
			}
		}
	}

	private static boolean check(int row, int col, int[] trace) {
		for (int i = 0; i < row; i++) {
			int pos = trace[i];
			int indx1 = col + row;
			int indx2 = col - row;
			if (pos == col || (pos + i) == indx1 || (pos - i) == indx2) {
				return false;
			}
		}
		return true;
	}
}
