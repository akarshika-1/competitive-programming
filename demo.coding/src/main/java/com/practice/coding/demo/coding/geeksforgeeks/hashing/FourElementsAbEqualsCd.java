package com.practice.coding.demo.coding.geeksforgeeks.hashing;

import java.util.HashMap;

class Pair{
    int first;
    int second;

    public Pair(int f, int s){
        first = f;
        second = s;
    }
}

public class FourElementsAbEqualsCd {

    public static boolean find(int[] a){
        HashMap<Integer, Pair> hashMap = new HashMap<>();
        for(int i=0;i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                int temp = a[i]+a[j];
                if(hashMap.containsKey(temp)){
                    System.out.println("("+hashMap.get(temp).first+" , "+hashMap.get(temp).second+") ("+a[i]+" , "+a[j]+")");
                    return true;
                }
                hashMap.put(temp, new Pair(a[i], a[j]));
            }
        }
        System.out.println("No Pairs found");
        return false;
    }

    public static void main(String[] args){
        find(new int[]{3,4,7,1,2,9,8});
        find(new int[]{3, 4, 7, 1, 12, 9});
        find(new int[]{65, 30, 7, 90, 1, 9, 8});
    }


}
