package _066_PlusOne_0706;

public class ElegentAns {
	public static void main(String[] args) {
		int[] n = { 6, 1, 4, 9 };
		int[] result = plusOne(n);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] plusOne(int[] digits) {
	        int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;

	    }
}
