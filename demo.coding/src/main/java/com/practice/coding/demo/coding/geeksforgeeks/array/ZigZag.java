package com.practice.coding.demo.coding.geeksforgeeks.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZigZag {

    public static int[] zigzag(int[] a){
        boolean flip = true;

        for(int i=0;i<a.length-1; i++){
            if(flip){
                if(a[i]>a[i+1]){
                    swap(a, i, i+1);

                }
            }else{
                if(a[i]<a[i+1]){
                    swap(a, i, i+1);
                }
            }
            flip = !flip;

        }
        return a;
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a1 = new int[]{4, 3, 7, 8, 6, 2, 1};
        System.out.println(Arrays.toString(zigzag(a1)));
        int[] a2 = new int[]{1, 4, 3, 2};
        System.out.println(Arrays.toString(zigzag(a2)));
    }
}
