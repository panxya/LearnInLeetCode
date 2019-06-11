package _001_Sum2_0324;

import java.util.HashMap;
//����һ�����ȱȶԣ��ٽ�ֵ�Ž�map��
public class Day1_Sum2_Answer {
	
	    public int[] twoSum(int[] nums, int target) {
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        for(int i=0;i<nums.length;i++){
	           hm.put(nums[i],i);
	        }
	        for(int i=0;i<nums.length;i++){
	            int complenent = target-nums[i];
	            if(hm.containsKey(complenent)&&hm.get(complenent)!=i){
	                return new int[] {i,hm.get(complenent)};
	            }
	        }
	        
	        throw new IllegalArgumentException("No two sum solution");
	    }
	
}
