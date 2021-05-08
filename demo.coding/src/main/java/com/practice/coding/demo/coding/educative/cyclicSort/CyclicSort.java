package com.practice.coding.demo.coding.educative.cyclicSort;

import java.util.Arrays;

public class CyclicSort {

    public static int[] cyclicSort(int[] a){
        int i =0;
        while(i<a.length){
            int j = a[i]-1;
            if(a[i]!=i+1){
                swap(a, i, j);
            }else{
                i++;
            }
        }
        return a;
    }

    public static void main(String[] args){
        int[] a = new int[]{2,6,4,3,1,5};
        System.out.println(Arrays.toString(cyclicSort(a)));
    }

    private static void swap(int a[], int i, int j){
        int t = a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
