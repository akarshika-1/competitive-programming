package com.practice.coding.demo.coding.educative.cyclicSort;

public class DuplicateNumber {
    public static Integer duplicates(int[] a){
        int i =0;
        while(i<a.length){
            if(a[i]<a.length && a[i] != a[a[i]]){
                swap(a, i, a[i]);
            }else{
                i++;
            }
        }

        for(int k=0; k<a.length; k++){
            if(a[k] != k){
                return k;
            }
        }
        return a.length;
    }

    private static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args){
        int[] a = new int[]{8, 3, 5, 2, 4, 6, 0, 1};
        System.out.println((duplicates(a)));

    }
}
