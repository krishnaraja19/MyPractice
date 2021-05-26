package com.practice.pack;

import java.util.Arrays;

public class TapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// My solution
		int[] A = {3,1,2,4,3};
		int P = A.length-1;
		int leftSum =0;
		int rightSum =0;
		int difference=0;
		for(int j=0;j<P;j++) {
			for(int i=0;i<A.length;i++) {
				if(j>=i)
				 leftSum +=A[i];
				else
				  rightSum += A[i];
			}
			System.out.println("leftSum : "+leftSum+" rightSum : "+rightSum);
			if(j==0)
				difference = Math.abs(leftSum - rightSum);
			if( difference> Math.abs(leftSum - rightSum)) {
				difference = Math.abs(leftSum - rightSum);
			}
			System.out.println(difference);
			leftSum = 0;
			rightSum = 0;
		}
		System.out.println("Solution difference :"+difference);
		
		TapeEquilibrium a = new TapeEquilibrium();
		System.out.println(a.solution(A));
	}
	
	public int solution(int[] A) {
		//founded soltion in google
	    // write your code in Java SE 8
	    // int idx = 0;
	    int sumPre = A[0];
	    int sumPost = 0;

	    for (int i = 1; i < A.length; i++) {
	        sumPost += A[i];
	    }
	    System.out.println("total :"+ sumPost);
	    int difMin = Math.abs(sumPost - sumPre);
	    int tempSub = 0;
	    for (int i = 1; i < A.length - 1; i++) {
	        sumPre += A[i];
	        sumPost -= A[i];
	        tempSub = Math.abs(sumPost - sumPre);
	        if (tempSub < difMin) {
	            difMin = tempSub;
	            // idx = i+1;

	        }
	    }
	    return difMin;
	}

}
