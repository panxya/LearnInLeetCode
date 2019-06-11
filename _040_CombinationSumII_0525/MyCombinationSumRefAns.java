package _040_CombinationSumII_0525;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyCombinationSumRefAns {
	public static void main(String[] args) {
		int[] nums = {10,1,2,7,6,1,5};
		int target = 8;
		List<List<Integer>> list = combinationSum2(nums, target);
		for(List<Integer> num:list) {
			for(int n:num) {
				System.out.print(n);
				
			}
			System.out.println();
		}		
	}
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		backtract(list,new ArrayList<>(),candidates,target,0);
		return list;
	        
	    }
	private static void backtract(ArrayList<List<Integer>> list, ArrayList arrayList, int[] candidates, int target,
			int i) {
		
		if(target<0) return;
		else if(target == 0 ) list.add(new ArrayList<>(arrayList));
		else {
			for(int j = i;j<candidates.length;j++) {
				if(j>i&&candidates[j]==candidates[j-1]) continue;
				arrayList.add(candidates[j]);
				backtract(list, arrayList, candidates, target-candidates[j], j+1);
				arrayList.remove(arrayList.size()-1);
			}
		}
		
	}
}
