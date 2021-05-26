package com.practice.pack;

public class OddOccurrencesInArray{
    public static void main(String args[]){
        int a = 0;
        int[] arr = {9,3,9,3,9,7,9};
        
        System.out.println(9^3^9);

        for (int i = 0; i < arr.length; i++ ){
            a = a ^ arr[i];
        }

        System.out.println(a);
    }
}