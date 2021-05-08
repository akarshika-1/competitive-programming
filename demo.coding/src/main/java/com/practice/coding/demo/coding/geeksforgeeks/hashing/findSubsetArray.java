package com.practice.coding.demo.coding.geeksforgeeks.hashing;

import java.util.HashSet;

public class findSubsetArray {

    public  static boolean find(int[] a, int[] b){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!hashSet.contains(a[i])){
                hashSet.add(a[i]);
            }
        }

        for(int j=0;j<b.length;j++){
            if(!hashSet.contains(b[j]))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(find(new int[]{11,1,13,21,3,7}, new int[]{11,3,7,1} ));
    }
}
