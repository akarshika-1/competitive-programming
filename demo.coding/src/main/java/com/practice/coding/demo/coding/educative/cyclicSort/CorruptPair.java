package com.practice.coding.demo.coding.educative.cyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorruptPair {

    public static int[] findCorruptPair(int[] a){
        int i=0;
        while(i<a.length){
            int j = a[i] - 1;
            if(a[i] != a[j]){
                swap(a, i , j);
            }else{
                i++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(i=0; i<a.length;i++){
            if(a[i]!=i+1){
                return new int[]{a[i], i+1};
            }
        }
        return new int[]{-1,-1};
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args){
        int[] a = new int[]{3, 1, 2, 5, 2};
        System.out.println(Arrays.toString(findCorruptPair(a)));
    }
}
