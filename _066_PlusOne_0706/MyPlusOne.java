package _066_PlusOne_0706;

public class MyPlusOne {

	public static void main(String[] args) {
		int[] n = { 6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3 };
		int[] result = plusOne(n);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static int[] plusOne(int[] digits) {

		int[] res = new int[digits.length + 1];
		for (int i = digits.length - 1; i >= 0; i--) {

			if (digits[i] != 9) {
				res[i + 1] = digits[i] + 1;
				for (int j = i; j >= 1; j--) {
					res[j] = digits[j - 1];
				}
				break;
			} else {
				res[res.length - 1] = 0;
			}

		}
		if (res[1] == 0) {
			res[0] = 1;
		}
		if (res[0] == 1) {
			return res;
		} else {
			String s = res.toString();
			int[] result = new int[digits.length];
			for (int i = 0; i < digits.length; i++) {
				result[i] = res[i + 1];
			}
			return result;
		}

	}
}
