package com.practice.coding.demo.coding.educative.bitwiseXor;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class TwoSingleNumber {

    public static int[] findTwoSingleNumber(int[] a){
        int x = a[0];
        for(int i=1;i<a.length;i++){
            x = x^a[i];
        }
        int rightMostBitSet = 1;
        while((rightMostBitSet & x)==0){
            rightMostBitSet = rightMostBitSet << 1;
        }
        int num1 =0, num2=0;
        for(int num : a){
            if((num & rightMostBitSet) != 0){
                num1 ^= num;
            }else{
                num2 ^= num;
            }
        }
        return new int[]{num1, num2};

    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(findTwoSingleNumber(new int[]{1, 4, 2, 1, 3, 5, 6, 2, 3, 5})));
        System.out.println(Arrays.toString(findTwoSingleNumber(new int[]{2, 1, 3, 2})));
    }
}
