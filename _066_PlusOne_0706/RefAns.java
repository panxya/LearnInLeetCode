package _066_PlusOne_0706;

public class RefAns {
	public static int[] plusOne(int[] digits) {
		int n = digits.length;
		for (int i = n - 1; i >= 0; i++) {
			if (digits[i] <= 0) {
				digits[i] += 1;
				return digits;
			}
			digits[i] = 0;
		}
		int[] res = new int[n + 1];
		res[0] = 1;
		return res;

	}
}
