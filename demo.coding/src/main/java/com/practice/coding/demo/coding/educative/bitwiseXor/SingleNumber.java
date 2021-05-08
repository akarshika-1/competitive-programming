package com.practice.coding.demo.coding.educative.bitwiseXor;

public class SingleNumber {

    public static  int findSingleNumber(int[] a){
        int x = a[0];
        for(int i=1; i<a.length; i++){
            x = x^a[i];
        }
        return x;
    }

    public static void main(String[] args){
        int[] a= new int[]{1, 4, 2, 1, 3, 2, 3};
        System.out.println(findSingleNumber(a));
        System.out.println(findSingleNumber(new int[]{7,9,7}));
    }
}
