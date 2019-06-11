package _027_RemoveElement_0420;

public class MyRemoveElement {
	public static void main(String[] args) {
		int[] nums = {2,2,3};
		int val =2;
		int a = removeElement(nums, val);
		System.out.println(a);
	}

	public static int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		if(nums.length==1&&nums[0]!=val) 
			return 1;
		
		boolean flag = true;
		for(int j = 0;j<nums.length;j++) {
			flag=flag&&nums[j]==val;
		}
		
		if(flag) return 0;
		
		int count = 0;
		int j = 0;
		for (int n = 0; n < nums.length; n++) {
				
			while (nums[n]==val&&j<nums.length-1&&nums[j] == val) {
					j++;
				}
			//确定j的跳跃值
			nums[n] = nums[j];
				
			if (j == nums.length-1) {
				break;
			}
			count++;//计数
			
			j++;//j日常滑动一个
			

		}

		return count;

	}
}
