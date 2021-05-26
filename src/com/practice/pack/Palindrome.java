package com.practice.pack;

public class Palindrome {
	
	public static void main(String args[]) {
		
		String myString = "sdfsdf";
		char[] myChar= myString.toCharArray();
		int loopLimit = myString.length()%2 == 0 ? myString.length()/2 : myString.length()/2+1;
		System.out.println(loopLimit);
		boolean isPalindrome = false;
		for(int i=0,j=myString.length()-1;i<loopLimit;i++,j--) {
			System.out.println(i + " : "+j);
			System.out.println(myChar[i] + " : "+myChar[j]);
			if(myChar[i]==myChar[j]) 
				isPalindrome = true;
			else
				isPalindrome = false;
		}
		System.out.println(isPalindrome);
	}
}
