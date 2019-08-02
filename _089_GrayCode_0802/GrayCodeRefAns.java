package _089_GrayCode_0802;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GrayCodeRefAns {
	public static void main(String[] args) {
		List<Integer> res = grayCode(5);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}

	public static List<Integer> grayCode(int n) {
		List<Integer> result = new LinkedList<>();
		for (int i = 0; i < 1 << n; i++)
			result.add(i ^ i >> 1);
		return result;
	}
}
