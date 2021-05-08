package com.practice.coding.demo.coding.educative.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {

    public static List<Integer> missingNumbers(int[] a){
        int i =0;
        while(i<a.length){
            int j = a[i] - 1;
            if(a[i]!=a[j]){
                swap(a, i, j);
            }else{
                i++;
            }
        }
        List<Integer> missingNumbers = new ArrayList<>();
        for(i=0;i<a.length;i++){
            if(a[i] != i+1){
                missingNumbers.add(i+1);
            }
        }
        return missingNumbers;
    }

    private static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args){
        int[] a = new int[]{2, 3, 1, 8, 2, 3, 5, 1};
        System.out.println((missingNumbers(a)));

    }
}
