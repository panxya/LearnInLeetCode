package _060_PermutationSequence_0630;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyComplicatedPermutationSequence {
	public static void main(String[] args) {
		int n = 9;
		int k = 3;
		System.out.println(getPermutation(n, k));
	}
	public static String getPermutation(int n, int k) {
		int num = getNum(n);
		String[] res =  new String[num];
		String[] group = new String[n];
		int count =0;
		for(int i = 1;i<=n;i++) {
			group[i-1]=Integer.valueOf(i).toString();
		}
		 Permutation(res,group,0,n);
		 int[] temp = new int[res.length];
		 for(int i = 0;i<res.length;i++) {
			 temp[i]=Integer.parseInt(res[i]);
		 }
		Arrays.sort(temp);
			 
			 
			 return String.valueOf(temp[k-1]);
		
        
    }
		
		private static int getNum(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return n*getNum(n-1);
		}
		
	}
		
	private static void Permutation(String[] res, String[] group, int start,int n) {
		
		if(start==n-1) {
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<=n-1;i++) {
				sb.append(group[i]);
				if (i == n - 1) {
					for (int j = 0; j < res.length; j++) {
						if (res[j] != null)
							continue;
						res[j] = sb.toString();
						break;
					}
						
				}
			}
			
		}else {
			for(int i = start;i<n;i++) {
				swap(group,start,i);
				Permutation(res, group, start+1, n);
				swap(group,start,i);
			}
		}
		
	}

	
	public static void swap(String[] str,int start,int end) {
		String temp = str[start];
		str[start] = str[end];
		str[end]=temp;
	}
}
