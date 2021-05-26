package com.practice.pack;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =  32;
		int index =0; 
		int indexLength = 0;
		String s = Integer.toBinaryString(n);
		int[] binary = new int[s.length()];
		if(s.length()<=2)
			System.out.println(0);
		for(int i=0;i<s.length(); i++) {
			binary[i] = Integer.parseInt(""+s.charAt(i));
		}
		for(int i=0;i<binary.length; i++) {
			if(binary[i] == 1) {
				
				if(i -index > 1 && indexLength < i -index) {
					indexLength = i -index;
				}
				index = i;	
			}
					
		}
		System.out.println(indexLength>0 ? indexLength-1 : 0);
	}

}
