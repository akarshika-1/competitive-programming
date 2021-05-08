package com.practice.coding.demo.coding.educative.twoPointer;

import java.util.Arrays;

public class DutchNationalFlag {

    public static int[] dutchFlag(int[] a){
        int low = 0;
        int high = a.length - 1;
        for(int i=0; i<=high;){
            if(a[i]==0){
                swap(a, low, i);
                low++;
                i++;
            }else if(a[i]==1){
                i++;
            }else{
                swap(a,high,i);
                high--;
            }
        }
        return a;
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String args[]){
        System.out.println(Arrays.toString(dutchFlag(new int[]{2,2,0,1,2,0})));
        System.out.println(Arrays.toString(dutchFlag(new int[]{1,0,2,1,0})));

    }
}
