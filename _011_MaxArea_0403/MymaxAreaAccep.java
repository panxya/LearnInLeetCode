package _011_MaxArea_0403;

public class MymaxAreaAccep {
	public static void main(String[] args) {
		int h[] = {1,8,6,2,5,4,8,3,7};
		int a = maxArea(h);
		System.out.println(a);
	}
	
	
	public static int maxArea(int[] height) {
		int max = 1;
		if(height.length==2&&((height[1]==0)||(height[0]==0))) {
			 max =0;
		}
		
		
		for(int i = 0;i<height.length;i++) {
			for(int j = 1 ;j<=i;j++) {
				if(height[i-j]<height[i]) {
					max = Math.max(max, height[i-j]*j);
				}else {
					max = Math.max(max, height[i]*j);
				}
				
				
			}
		}
		
		return max;

	}
}
