package _033_Search_0426;

public class FindIndex {
	 public static void main(String[] args) {
			int[] nums = {4,5,6,7,0,1,2};
			int target =0;
			int res = search(nums, target);
			System.out.println(res);
		}

	private static int search(int[] nums, int target) {
		if(nums==null||nums.length==0) return -1;
		//找最小值
		int l = 0;int r=nums.length-1;int m = 0;
		while(l<r) {
			m = (l+r)/2;
			if(nums[m]>nums[r]) {
				l=m+1;
			}else {
				r=m;
			}
		}
		
		//找左右
		int s = l;
		l=0;r=nums.length-1;
		if(target>=nums[s]&&target<=nums[r]) {
			l=s;
		}else {
			r=s;
		}
		
		//二分
		while(l<=r) {
			m=(l+r)/2;
			if(nums[m]==target) return m;
			else if(nums[m]>target) {
				r=m-1;
			}else {
				l=m+1;
			}
		}
		
		return -1;
	}
}
