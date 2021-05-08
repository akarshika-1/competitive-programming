package com.practice.coding.demo.coding.educative.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSum {

    public static List<List<Integer>> findQuadruple(int[] a, int targetSum){
        List<List<Integer>> quadruples = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0; i<a.length-3; i++){
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            for(int j=i+1;j<a.length-2;j++){
                if(j>i+1 && a[j]==a[j-1]){
                    continue;
                }
                searchPair(a, i, j, targetSum, quadruples);
            }
        }
        return quadruples;
    }

    public static void searchPair(int[] a, int first, int second, int targetSum, List<List<Integer>> quadruples){
        int low = second+1;
        int high = a.length-1;
        while(low<high){
            int sum = a[first] + a[second] + a[low] + a[high];
            if(sum == targetSum){
                quadruples.add(Arrays.asList(a[first], a[second], a[low], a[high]));
                low++;
                high--;
                while(low<high && a[low] == a[low-1]){
                    low++;
                }
                while(low<high && a[high] == a[high+1]){
                    high--;
                }
            }else if(sum < targetSum){
                low++;
            }else{
                high--;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(findQuadruple(new int[]{4,1,2,-1,1,-3}, 1));
        System.out.println(findQuadruple(new int[]{2,0,-1,1,-2,2}, 2));
    }
}
