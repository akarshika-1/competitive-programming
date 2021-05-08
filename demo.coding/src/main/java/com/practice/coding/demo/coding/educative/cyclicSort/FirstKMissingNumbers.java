package com.practice.coding.demo.coding.educative.cyclicSort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstKMissingNumbers {

    public static List<Integer> find(int[] a, int k){
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
        List<Integer> missing = new ArrayList<>();
        Set<Integer> extra = new HashSet<>();
        for(i=0; i<n && missing.size()<k; i++){
            if(a[i]!=i+1){
                missing.add(i+1);
                extra.add(a[i]);
            }
        }
       for(int j=i; missing.size()<k; j++){
            if(!extra.contains(j+1)){
                missing.add(j+1);
            }
        }

       return missing;
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args){
        System.out.println(find(new int[]{3, -1, 4, 5, 5},3));
        System.out.println(find(new int[]{2, 3, 4},3));
        System.out.println(find(new int[]{-2, -3, 4},2));
    }
}
