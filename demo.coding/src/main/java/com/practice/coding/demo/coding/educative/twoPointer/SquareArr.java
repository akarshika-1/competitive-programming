package com.practice.coding.demo.coding.educative.twoPointer;

import java.util.Arrays;

public class SquareArr {

    public static int[] squareArr(int[] a){
        int l = 0;
        int n = a.length;
        int[] sq = new int[n];
        int r = n - 1;
        int k = n - 1;
        while(l<=r){
            if(a[l]*a[l]>a[r]*a[r]){
               sq[k--] = a[l]*a[l];
               l++;
            }else{
                sq[k--]=a[r]*a[r];
                r--;
            }
        }
        return sq;
    }

    public static void main(String args[]){
        int[] a = new int[]{-2, -1, 0, 2, 3};
        System.out.println(Arrays.toString(squareArr(a)));
    }
}
