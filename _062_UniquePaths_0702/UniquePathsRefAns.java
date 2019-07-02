package _062_UniquePaths_0702;

public class UniquePathsRefAns{
	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 2));
	}
	public static int uniquePaths(int m, int n) {
		int N = n+m-2;//how much steps that need to go.
		int k = m-1;//number of steps that need to go down.
		double res = 1;
		for(int i =1;i<=k;i++) {
			res = res*(N-k+i)/i;//choose unique k in N steps。
		}
		return (int)res;
    }
}
