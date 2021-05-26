package com.practice.pack;

import java.util.HashSet;
import java.util.Set;


class CodilityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,2,3,5,4};
		
		int N = A.length;
		int result =0;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i:A) {
			if(i>0) {
				set.add(i);
			}
		}
		
		for(int i = 1;i< N+1;i++) {
			if(!set.contains(i)) {
				result = i;
				break;
			}else{
                result = i+1;
                
          }
			
		}
		
		
		System.out.println(result);

	}

}
