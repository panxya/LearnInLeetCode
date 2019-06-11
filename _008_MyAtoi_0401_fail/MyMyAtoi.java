package _008_MyAtoi_0401_fail;

import java.util.ArrayList;

//不会
public class MyMyAtoi {

	public static void main(String[] args) {
		String str = "    -32123";
		int a = myAtoi(str);
		System.out.println(a);
	}

	public static int myAtoi(String str) {
		int max = 0;
		int n = 0;
		ArrayList list = new ArrayList();

		while (n < str.length()) {
			if (str.matches("[0-9]")) {

			}
		}

		return 0;

	}
}
