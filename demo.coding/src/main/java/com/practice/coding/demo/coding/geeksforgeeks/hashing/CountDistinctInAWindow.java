package com.practice.coding.demo.coding.geeksforgeeks.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountDistinctInAWindow {

    public static List<Integer> countDistinct(int[] a, int k){
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        for(int i=0;i<k;i++){
            elementCountMap.put(a[i], elementCountMap.getOrDefault(a[i], 0)+1);
        }
        result.add(elementCountMap.size());

        for(int i=k; i<a.length;i++){
            if(elementCountMap.get(a[i-k])==1){
                elementCountMap.remove(a[i-k]);
            }else{
                elementCountMap.put(a[i-k], elementCountMap.get(a[i-k])-1);
            }

            elementCountMap.put(a[i], elementCountMap.getOrDefault(a[i], 0)+1);
            result.add(elementCountMap.size());
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(countDistinct(new int[]{1,2,1,3,4,2,3}, 4));
        System.out.println(countDistinct(new int[]{1,2,4,4}, 2));
    }
}
