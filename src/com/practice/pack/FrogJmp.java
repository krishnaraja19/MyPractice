package com.practice.pack;

public class FrogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 10;
		int Y = 85;
		int D = 30;
		int jump =0;
		for(int i = X,j=1; i<Y; i = i + D,j++) {
			jump = j;
		}
		System.out.println(jump);
	}
	
//	 int diff = Y - X;
//	    int count = diff / D;
//	    if (diff % D > 0) {
//	        count++;
//	    }
//	    return count;

}
