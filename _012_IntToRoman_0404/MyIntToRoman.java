package _012_IntToRoman_0404;

public class MyIntToRoman {
	public static void main(String[] args) {
		int i = 10;
		String s = intToRoman(i);
		System.out.println(s);
	}

	public static String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();

		if (num / 1000 >= 1) {
			int x = num / 1000;
			for (int i = 0; i < x; i++) {
				sb.append("M");
			}
			num -= x * 1000;
		}
		
		if (num / 900 >= 1) {
			sb.append("CM");
			num -= 900;
		}
		if (num / 500 >= 1) {
			sb.append("D");
			num -= 500;
		}
		if (num / 400 >= 1) {
			sb.append("CD");
			num -= 400;
		}
		if (num / 100 >= 1) {
			int x = num / 100;
			for (int i = 0; i < x; i++) {
				sb.append("C");
			}
			num = num - x * 100;
		}
		if (num / 90 >= 1) {
			sb.append("XC");
			num -= 90;
		}
		if (num / 50 >= 1) {
			sb.append("L");
			num -= 50;
		}
		if (num / 40 >= 1) {
			sb.append("XL");
			num -= 40;
		}
		if (num / 10 >= 1) {
			int x = num / 10;
			for (int i = 0; i < x; i++) {
				sb.append("X");
			}
			num = num - x * 10;
		}
		if (num / 9 >= 1) {
			sb.append("IX");
			num -= 9;
		}
		if (num / 5 >= 1) {
			sb.append("V");
			num -= 5;
		}
		if (num / 4 >= 1) {
			sb.append("IV");
			num -= 4;
		}
		if (num / 1 >= 1) {
			int x = num;
			for (int i = 0; i < x; i++) {
				sb.append("I");
			}
		}

		return sb.toString();

	}
}
