package _056_MergeIntervals_0626;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

//链表解法
public class MergeIntervalsRefAns<T> {
	
	
	private class Interval{
		int start;
		int end;
		Interval(){
			start=0;
			end = 0;
		}
		Interval(int s,int e){
			start =s;
			end = e;
		}
	}
	
	private class IntervalComparator implements Comparator<Interval>{

		@Override
		public int compare(Interval a, Interval b) {
			return a.start<b.start?-1:a.start==b.start?0:1;
		}	
		
	}
	
	 public List<Interval> merge(List<Interval> intervals) {
	        Collections.sort(intervals,new IntervalComparator());
	        LinkedList<Interval> merged = new LinkedList<Interval>();
	        for(Interval interval:intervals) {
		        //空则加入，新加入的起点大于最后一个终点也加入
		        if(merged.isEmpty()||merged.getLast().end<interval.start) {
		        	merged.add(interval);
		        }else {
		        	merged.getLast().end=Math.max(merged.getLast().end, interval.end);
		        }
	        }
	        return merged;
	    }
	
	
}
