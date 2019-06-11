package _042_TrappingRainWater_0527;

public class UsingTwoPointer {
	public static void main(String[] args) {
		int[] height = { 5, 2, 1, 2, 1, 5 };
		int a = trap(height);
		System.out.println(a);
	}

	private static int trap(int[] height) {
		int i = 0, j = height.length - 1, imax = 0, jmax = 0, ans = 0;
		while (i < j) {
			if (height[i] < height[j]) {
				if (height[i] >= imax) {
					imax = height[i];
				} else {
					ans += (imax - height[i]);
				}
				++i;
			}else {
				if (height[j] >= jmax) {
					jmax = height[j];
				} else {
					ans += (jmax - height[j]);
				}
				--j;
			}
		}
		return ans;
	}
}
