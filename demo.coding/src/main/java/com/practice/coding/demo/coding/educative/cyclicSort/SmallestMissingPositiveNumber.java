package com.practice.coding.demo.coding.educative.cyclicSort;

public class SmallestMissingPositiveNumber {

    public static int find(int[] a){
        int i = 0;
        int n = a.length;
        while(i<n){
            int j = a[i]-1;
            if(a[i]>0 && a[i]<=n && a[i]!=a[j]){
                swap(a, i, j);
            }else{
                i++;
            }
        }

        for(int k=0;k<n; k++){
            if(a[k]!=k+1){
                return k+1;
            }
        }
        return n+1;
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args){
        System.out.println(find(new int[]{-3, 1, 5, 4, 2}));
        System.out.println(find(new int[]{3, -2, 0, 1, 2}));
        System.out.println(find(new int[]{3, 2, 5, 1}));
    }
}
