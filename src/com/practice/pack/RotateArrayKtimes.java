package com.practice.pack;

public class RotateArrayKtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4,5,3,1,6,7};
		int rotate = 3;
		int[] rotatedArr = new int[arr.length];
		
		System.out.println(6%4);
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr.length-1<i+rotate) {
				rotatedArr[i] = arr[(i+rotate)%(arr.length)];
			}else {
				rotatedArr[i] = arr[i+rotate];
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(rotatedArr[i]);
		}

	}

}
