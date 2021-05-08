package com.practice.coding.demo.coding.educative.cyclicSort;

public class MissingNumber {
    public static Integer missingNumbers(int[] a){
        int i =0;
        while(i<a.length){
            int j = a[i] - 1;
            if(a[i]!=a[j]){
                swap(a, i, j);
            }else{
                i++;
            }
        }
        for(i=0;i<a.length;i++){
            if(a[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }

    private static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args){
        int[] a = new int[]{2, 1, 3, 3, 5, 4};
        System.out.println((missingNumbers(a)));

    }
}
