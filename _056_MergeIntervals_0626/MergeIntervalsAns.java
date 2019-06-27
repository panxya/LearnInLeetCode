package _056_MergeIntervals_0626;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsAns {
	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = merge(intervals);
		for(int i = 0;i<res.length;i++) {
			for(int j = 0;j<res[i].length;j++) {
				System.out.printf("%3d",res[i][j]);
				
			}
			System.out.println();
		}
		
		
	}
	public static int[][] merge(int[][] intervals) {
		if(intervals.length<=1) {
			return intervals;
		}
		Arrays.sort(intervals,(i1,i2)->Integer.compare(i1[0], i2[0]));
		List<int[]> res = new ArrayList<>();
		int[] newInterval = intervals[0];
		res.add(newInterval);
		for(int[] interval:intervals) {
			if(interval[0]<=newInterval[1]) {// Overlapping intervals, move the end if needed
				newInterval[1]=Math.max(newInterval[1], interval[1]);
			}else {
				newInterval=interval;
				res.add(newInterval);
			}
		}
		
		return res.toArray(new int[res.size()][]);
		
	}
}
