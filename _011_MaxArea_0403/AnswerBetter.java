package _011_MaxArea_0403;

public class AnswerBetter {
	public static void main(String[] args) {
		int h[] = {1,8,6,2,5,4,8,3,7};
		int a = maxArea(h);
		System.out.println(a);
	}
	
	public static int maxArea(int[] height) {
	        int maxarea = 0, l = 0, r = height.length - 1;
	        while (l < r) {
	            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
	            if (height[l] < height[r])
	                l++;
	            else
	                r--;
	        }
	        return maxarea;
	    }
}
