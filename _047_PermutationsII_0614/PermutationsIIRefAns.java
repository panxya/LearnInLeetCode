package _047_PermutationsII_0614;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsIIRefAns {
	public static void main(String[] args) {
		int[] nums = {1,1,1};
		List<List<Integer>> list=permuteUnique(nums);
		for(int j =0;j<list.size();j++) {
			List<Integer> ll = list.get(j);
			for(int i =0;i<ll.size();i++) {
				System.out.print(ll.get(i)+",");
			}
			System.out.println();
		}
	}

	private static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list,new ArrayList<>(),nums,new boolean[nums.length]);
		return list;
	}

	private static void backtrack(List<List<Integer>> list, ArrayList arrayList, int[] nums,
			boolean[] bs) {
		if(arrayList.size()==nums.length) {
			list.add(new ArrayList<>(arrayList));
		}else {
			for(int i = 0;i<nums.length ;i++) {
				if(bs[i]||i>0&&nums[i]==nums[i-1]&&!bs[i-1]) continue;
				bs[i]=true;
				arrayList.add(nums[i]);
				backtrack(list, arrayList, nums, bs);
				bs[i]=false;
				arrayList.remove(arrayList.size()-1);
			}
			
		}
		
		
		
	}
}
