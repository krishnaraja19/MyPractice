package com.practice.pack;

import java.util.HashSet;
import java.util.Set;

public class MyThread  {

	 
	    public static void main(String[] args) 
	    { 
	       String sb = new String("land");
	       sb = sb.concat("mister").replace('d', 'n').toUpperCase().replace('M', 'N').toString();
	       
	       System.out.println(sb);
	       
	       if ( 77 == 7_7) {
	    	   System.out.println("Moon");
	    	   
	       } 
	       else {
	    	   System.out.println("No Moon");
	       }
	    } 
}