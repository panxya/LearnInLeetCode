package _042_TrappingRainWater_0527;
/*Given n non-negative integers representing an elevation map 
where the width of each bar is 1, 
compute how much water it is able to trap after raining.*/

/*
 * i从j-2开始，j从2开始，每次i=i+j，循环一次数组
	条件：i>i+1&&j>j-1
	i往右到i>j-1，j往左到j>i+1//两个循环
	n=abs(j-i)-(j-1)-(j-2)直到i+1
 
 Q求ij之间的最大值*/
public class MyTrappingRainWaterFail {
	public static void main(String[] args) {
		int[] height = { 5,2,1,2,1,5};
		int a = trap(height);
		System.out.println(a);
	}

	public static int trap(int[] height) {
		if (height.length < 3)
			return 0;
		int i = 0;
		int j = i+1;
		
		int contain = 0;// n记录水量大小
		while (true) {
			while (true) {
				if (height[i] <= height[i + 1]) {
					i++;
					j = i + 1;
				} else if (height[j] < height[i] && j < height.length - 1) {
					j++;

				} else {
					break;
				}

			}
			
			// ij之间
			int mid = (i + j) / 2;
			int x = mid;
			int y = mid;
			while (x >= i && y <= j) {
				if ( (y + 1) <= j&&height[y] <= height[y + 1]) {
					y++;
				} else if ((x - 1) >= i&&height[x] <= height[x - 1]  ) {
					x--;
				} else {
					break;
				}
			}
			// 求容量大小  长*宽-多的
			if (height[i] > 0 && height[j] > 0 && i == x && j == y) {
				contain = contain + (Math.min(height[x], height[y]) * (y - x - 1));
				for (int n = x + 1; n < y; n++) {
					contain = contain - height[n];
				}
			}
			//一次结束后变换ij位置
			if (x != i) {
				i++;
			} else {
				i = j;
				j++;
			}
			//约束最后
			if (j >= height.length - 1) {
				break;
			}
			//变换j位置
			while (true) {
				if (height[i] <= height[i + 1] || j == height.length - 1) {
					i++;
					j = i + 1;
				} else if (height[j] < height[i] && j < height.length - 1) {
					j++;

				} else {
					break;
				}

			}

		}

		return contain;

	}
}
