package com.practice.coding.demo.coding.misclleneous;

public class StringPermutation {

    public static boolean permutation(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        int[] count = new int[128];
        for(int i=0; i<a.length(); i++){
            count[a.charAt(i)]++;
        }
        for(int i=0; i<b.length(); i++){
            count[b.charAt(i)]--;
            if(count[b.charAt(i)]<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(permutation("abdc","bacf"));
        System.out.println(permutation("abc","bac"));

    }
}
