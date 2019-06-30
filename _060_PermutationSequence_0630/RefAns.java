package _060_PermutationSequence_0630;

import java.util.LinkedList;
import java.util.List;

public class RefAns {
	public static void main(String[] args) {
		int n = 9;
		int k = 3;
		System.out.println(getPermutation(n, k));
	}

	private static String getPermutation(int n, int k) {
		List<Integer> num = new LinkedList<>();
		for(int i =1;i<=n;i++) num.add(i);
		int[] fact = new int[n];
		fact[0]=1;
		for(int i =1;i<n;i++) fact[i]=i*fact[i-1];
		k--;
		StringBuilder sb = new StringBuilder();
		for(int i=n;i>0;i--) {
			int ind = k/fact[i-1];
			k %= fact[i-1];
			sb.append(num.get(ind));
			num.remove(ind);
		}
		return sb.toString();
	}
}
