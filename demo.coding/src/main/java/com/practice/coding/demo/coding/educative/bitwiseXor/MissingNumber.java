package com.practice.coding.demo.coding.educative.bitwiseXor;

public class MissingNumber {

    public static int findMissingNumber(int[] a){
        int x1=1, x2=a[0];
        for(int i=2;i<=a.length+1;i++){
            x1=x1^i;
        }
        for(int i=1;i<a.length;i++){
            x2=x2^a[i];
        }
        return x1^x2;
    }

    public static void main(String[] args){
        int[] a = new int[]{1, 5, 2, 6, 4};
        System.out.println(findMissingNumber(a));
    }
}
