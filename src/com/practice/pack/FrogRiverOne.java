package com.practice.pack;

import java.util.Arrays;

public class FrogRiverOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1,3,1,4,2,3,5,4};
		int X = 5;
		int posCal = 0;
		int[] B = new int[X+1];
		
		 
		 for(int i = 0;i<A.length;i++) {
			 if(B[A[i]]==0) {
				 B[A[i]] = A[i];
				 posCal++;
				 if(X==posCal)
					 System.out.println(i);
			 }
		 }
		
		 System.out.println(-1);
		
	}

}
