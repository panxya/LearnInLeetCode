package _057_InsertInterval_0627;

import java.util.ArrayList;
import java.util.List;

public class MyInsertInterval {
	/*
	 * Given a set of non-overlapping intervals, insert a new interval into the
	 * intervals (merge if necessary).
	 * 
	 * You may assume that the intervals were initially sorted according to their
	 * start times.
	 */
	public static void main(String[] args) {
		int[][] intervals = { { 1, 5 } };
		int[] newInterval = { 2, 7 };
		int[][] res = insert(intervals, newInterval);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.printf("%3d", res[i][j]);

			}
			System.out.println();
		}
	}

	public static int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> list = new ArrayList<>();
		int[] left = new int[intervals.length + 1];
		int[] right = new int[intervals.length + 1];
		int l = 0, r = 0;
		boolean leftFound = false, rightFound = false;
		for (int i = 0; i < intervals.length; i++) {
			if (!leftFound && intervals[i][0] > newInterval[0]) {
				leftFound = true;
				left[l] = newInterval[0];

			}

			if (!rightFound && intervals[i][1] > newInterval[1]) {
				rightFound = true;
				right[r] = newInterval[1];

			}

			left[l] = intervals[i][0];

			right[r] = intervals[i][1];
			l++;
			r++;
		}
		if (!leftFound)
			left[l] = newInterval[0];
		if (!rightFound)
			right[r] = newInterval[1];
		for (int i = 0; i < left.length; i++) {
			int[] temp = new int[2];
			temp[0] = left[i];
			while (i < left.length) {
				if (i + 1 > left.length - 1 || right[i] < left[i + 1]) {// 直到到达了长度以及或者小于下一个左
					temp[1] = right[i];
					break;
				}
				i++;
			}
			list.add(temp);
		}

		int[][] res = new int[list.size()][2];

//		if(intervals.length<1) {
//			res[0][0]=newInterval[0];
//			res[0][1]=newInterval[1];	
//			return res;
//		}
		for (int i = 0; i < list.size(); i++) {
			res[i][0] = list.get(i)[0];
			res[i][1] = list.get(i)[1];

		}

		return res;

	}
}
