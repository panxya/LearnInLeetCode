package _027_RemoveElement_0420;

public class Answer {
	
	public static void main(String[] args) {
		int[] nums = {2,2,3,2};
		int val =2;
		int a = removeElement(nums, val);
		System.out.println(a);
	}
	public static int removeElement(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i++] = nums[j];//每次比较的是滑动的j和val  变化的是不变的i
	           
	        }
	    }
	    return i;
	}
}
