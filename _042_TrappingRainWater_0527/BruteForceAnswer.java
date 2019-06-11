package _042_TrappingRainWater_0527;

public class BruteForceAnswer {
	public static void main(String[] args) {
		int[] height = { 5,2,1,2,1,5};
		int a = trap(height);
		System.out.println(a);
	}

	private static int trap(int[] height) {
		int ans = 0;
		int h = height.length;
		for(int i = 0;i<h-1;i++) {
			int left = 0;
			int right = 0;
			for(int j=i;j>=0;j--) {
				left = Math.max(left, height[j]);//搜索左边的最大边长
			}
			for(int j=i;j<h;j++) {
				right = Math.max(right, height[j]);
			}
			ans += Math.min(left,right)-height[i];
		}
		return ans;
	}

}
