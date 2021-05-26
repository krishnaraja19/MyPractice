package com.practice.pack;

import java.util.Arrays;


public class PermMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {2,3,1,4,5,6,7,9};
//		int missingNumber=0;
//		if(A.length == 0)
//			missingNumber=1;
//		if(A.length == 1)
//			missingNumber=2;
//		if(A.length == 2)
//			missingNumber=3;
//		A = Arrays.stream(A).sorted().toArray();
//		for(int i=0,j=1;i<A.length;i++,j++) {
//			if(j!=A[i]) {
//				missingNumber = j;
//				break;
//			}
//		}
		int n = A.length+1;
		int total = Arrays.stream(A).sum();
		int result = (n*(n+1))/2;
		System.out.println(result - total);
	
	}

}
