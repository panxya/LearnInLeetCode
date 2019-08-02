package _089_GrayCode_0802;

import java.util.ArrayList;
import java.util.List;

public class AnotherAns {
	public static void main(String[] args) {
		List<Integer> res = grayCode(2);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
	public static List<Integer> grayCode(int n) {
		List<Integer> rs = new ArrayList<Integer>();
		rs.add(0);
		for (int i = 0; i < n; i++) {
			int size = rs.size();
			for (int k = size - 1; k >= 0; k--)
				rs.add(rs.get(k) | 1 << i);
		}
		return rs;
	}
}
