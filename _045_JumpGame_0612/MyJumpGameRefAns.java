package _045_JumpGame_0612;

public class MyJumpGameRefAns {
	public static void main(String[] args) {
		int[] n = {2,3,1,1,4,2,1};
		System.out.println(jump(n));
	}

	public static int jump(int[] nums) {
		int end = 0,maxPos=0,count=0;
		for(int i =0;i<nums.length-1;i++) {
			maxPos=Math.max(maxPos, i+nums[i]);
			if(end==i) {//遇到边界，就更新边界，并且步数加一
				count++;
				end = maxPos;
			}
		}
		return count;

	}
}
