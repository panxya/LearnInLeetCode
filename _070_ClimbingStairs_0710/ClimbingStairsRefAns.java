package _070_ClimbingStairs_0710;

public class ClimbingStairsRefAns {
	public static void main(String[] args) {
		System.out.println(climbStairs(3));
	}
	
	public static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}

		return second;
	}
}
