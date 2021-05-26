package com.practice.pack;

import java.util.Arrays;

public class Test1 {
	
	public static void main (String args[]) {
		int[] A = {1000,2000,3000,4000};
		int[] B = {100,200,300,400,500,600,1000,2000};
		 int n = A.length;
	        int m = B.length;;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        try {
	        	 for (int k = 0; k < n; k++) {
	 	            while (i < m - 1 && B[i] < A[k])
	 	                i += 1;
	 	            if (A[k] == B[i])
	 	                System.out.println(A[k]);
	 	        }
	        }catch(Exception e) {
	        	System.out.println(e.getMessage());
	        }
	       
	        //System.out.println(-1);
	}

}
