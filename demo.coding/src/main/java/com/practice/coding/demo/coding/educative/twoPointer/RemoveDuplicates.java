package com.practice.coding.demo.coding.educative.twoPointer;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] a){
        int nextIndex = 1;
        for(int i=1; i<a.length; i++){
           if(a[i-1]!=a[i]){
               a[nextIndex]=a[i];
               nextIndex++;
            }
        }
        return nextIndex;
    }

    public static void main(String args[]){
        int[] a = new int[]{2,3,3,3,6,9,9};
        System.out.println(removeDuplicates(a));
    }
}
