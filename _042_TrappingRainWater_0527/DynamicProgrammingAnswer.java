package _042_TrappingRainWater_0527;

public class DynamicProgrammingAnswer {
	public static void main(String[] args) {
		int[] height = { };
		int a = trap(height);
		System.out.println(a);
	}

	private static int trap(int[] height) {
		if (height == null||height.length==0)
			return 0;
		
		int len = height.length;
		int ans = 0;
		int[] left = new int[len];
		int[] right = new int[len];
		left[0]=height[0];
		right[len-1]=height[len-1];
		for (int i = 1; i < len; i++) {
			left[i] = Math.max(height[i], left[i - 1]);
		}
		for (int i = len - 2; i >= 0; i--) {
			right[i] = Math.max(height[i], right[i + 1]);
		}
		for (int i = 1; i < len-1; i++) {
			ans += Math.min(left[i], right[i])-height[i];
		}
		return ans;
	}
}
