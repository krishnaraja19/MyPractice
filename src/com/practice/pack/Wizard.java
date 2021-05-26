package com.practice.pack;

import java.util.Scanner;

public class Wizard {
	
	public static void main(String args[]) {
		Wizard wizz = new Wizard();
		Scanner input = new Scanner(System.in);
		String inputRange = "Please provide the number from 1 to 100";
		String slogam = "Abracadabra";
		System.out.println("Please provide the magic count:");
		int magicCount = input.nextInt();
		
		
		if(wizz.validate(magicCount)) {
			for(int i=1;i<=magicCount;i++) {
				System.out.println(i+" "+slogam);
			}
		}else {
			System.out.println(inputRange);
		}
		
		
	}
	public boolean validate(int number) {
		if(number>=1 && number<=100) {
			return true;
		}
		return false;
	}
}
