package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

import java.util.Arrays;

public class NumberRange {

    public static int[] findRange(int[] a, int key){
        int[] result = new int[]{-1,-1};
        result[0] = search(a,key,false);
        if(result[0]!=-1){
            result[1] = search(a, key, true);
        }
        return result;
    }

    public static int search(int[] a, int key, boolean findMaxIndex){
        int start = 0;
        int end = a.length-1;
        int keyIndex = -1;
        while(start<=end){
            int m = start + (end-start)/2;
            if(key>a[m]){
                start = m +1;
            }else if(key<a[m]){
                end = m-1;
            }else{
                keyIndex = m;
                if(findMaxIndex){
                    start = m+1;
                }else{
                    end = m-1;
                }
            }
        }
        return keyIndex;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(findRange(new int[]{4, 6, 6, 6, 9}, 6)));
        System.out.println(Arrays.toString(findRange(new int[]{1, 3, 8, 10, 15}, 10)));
        System.out.println(Arrays.toString(findRange(new int[]{1, 3, 8, 10, 15}, 12)));
    }
}
