package com.practice.coding.demo.coding.educative.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumbers {

    public static List<Integer> duplicates(int[] a){
        int i =0;
        while(i<a.length){
            int j = a[i] - 1;
            if(a[i] != a[j]){
                swap(a, i, j);
            }else{
                i++;
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for(int k=0; k<a.length; k++){
            if(a[k] != k+1){
                duplicates.add(a[k]);
            }
        }
        return duplicates;
    }

    private static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args){
        int[] a = new int[]{5, 4, 7, 2, 3, 5, 3};
        System.out.println((duplicates(a)));

    }
}
