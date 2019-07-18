package _077_Combinations_0718;

import java.util.ArrayList;
import java.util.List;

public class CombinationsRefAns {
	public static void main(String[] args) {
		List<List<Integer>> list = combine(4, 2);
		for (int i = 0; i < list.size(); i++) {
			List<Integer> ll = list.get(i);
			for (int j = 0; j < list.get(i).size(); j++) {
				System.out.print(ll.get(j));
			}
			System.out.println();
		}
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> combs = new ArrayList<List<Integer>>();
		combine(combs, new ArrayList<Integer>(), 1, n, k);

		return combs;

	}

	private static void combine(List<List<Integer>> combs, ArrayList<Integer> comb, int start, int n, int k) {
		if (k == 0) {
			combs.add(new ArrayList<Integer>(comb));
			return;
		}
		for (int i = start; i <= n - k + 1; i++) {
			comb.add(i);
			combine(combs, comb, i + 1, n, k - 1);
			comb.remove(comb.size() - 1);
		}

	}
}
