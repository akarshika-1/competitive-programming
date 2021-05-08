package com.practice.coding.demo.coding.educative.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSumToZero {

    public static List<List<Integer>> findTriplets(int[] a){
        if(a==null || a.length<2){
            throw new IllegalArgumentException();
        }
        Arrays.sort(a);
        List<List<Integer>> triplets = new ArrayList<>();
        for(int i = 0 ; i<a.length-2; i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            targetSum(-a[i], a,i+1, triplets);
        }
        return triplets;
    }

    private static List<List<Integer>> targetSum(int x, int[] a, int start, List<List<Integer>> triplets){
        int end = a.length-1;
        while(start<end){
            int sum = a[start] + a[end];
           if(sum==x){
               triplets.add(Arrays.asList(-x, a[start], a[end]));
                start++;
                end--;
                while(start<end && a[start] == a[start-1]){
                    start++;
                }
                while(start<end && a[end] == a[end+1]){
                    end--;
                }
            }else if(sum>x){
                end--;
            }else {
                start++;
            }
        }
        return triplets;
    }

    public static void main(String args[]){
        int[] a = new int[]{-3, 0, 1, 2, -1, 1, -2};
        System.out.println(findTriplets(a));
    }
}
