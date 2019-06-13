package _046_Permutations_0613;

import java.util.ArrayList;
import java.util.List;

public class MyPermutations {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> list=permute(nums);
		for(List ll:list) {
			
			for(int i =0;i<ll.size();i++) {
				System.out.print(ll.get(i)+",");
			}
			System.out.println();
		}
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(list,new ArrayList<>(),nums);
		
		return list;
        
    }

	private static void backtrack(List<List<Integer>> list, ArrayList arrayList, int[] nums) {
		if(arrayList.size()==nums.length) {
			list.add(new ArrayList<>(arrayList));
		}else {
			for(int i = 0;i<nums.length ;i++) {
				if(arrayList.contains(nums[i])) continue;
				arrayList.add(nums[i]);
				backtrack(list, arrayList, nums);
				arrayList.remove(arrayList.size()-1);
			}
		}
		
	}
}
