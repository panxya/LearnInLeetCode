package _048_RotateImage_0615;

public class RotateRefAns {
	public static void main(String[] args) {
		int[][] n = {
				{5, 1, 9,11},
				{2, 4, 8,10},
				{13, 3, 6, 7},
				{15,14,12,16}
		};
		rotate(n);
		
		for(int[] i :n) {
			for(int j:i) {
				System.out.printf("%3d",j);
			}
			System.out.println();
		}
	}
	public static void rotate(int[][] matrix) {
		int i=0,j=matrix.length-1;
		while(i<j){
			int[] temp=matrix[i];
			matrix[i]=matrix[j];
			matrix[j]=temp;
			i++;j--;
		}
		for(int m =0;m<matrix.length ;m++) {
			for(int n = m+1;n<matrix[m].length;n++) {
				int temp = matrix[m][n];
				 matrix[m][n]= matrix[n][m];
				 matrix[n][m]=temp;
			}
		}
	}
}
