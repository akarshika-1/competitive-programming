package com.practice.coding.demo.coding.educative.bitwiseXor;

public class ComplementOfBaseTen {

    public static int complement(int num){
       int n = num;
       int bitCount = 0;
       while(n>0){
           bitCount++;
           n = n >> 1;
       }

       int allSetBit = (int)Math.pow(2, bitCount) - 1;
       return num ^ allSetBit;
    }

    public static void main(String[] args){
        System.out.println(complement(8));
        System.out.println(complement(10));
    }
}
