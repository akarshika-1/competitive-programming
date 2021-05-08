package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class NextLetter {

    public static char findNext(char[] s, char key){
        int n = s.length;
        if(key>s[n-1]||key<s[0]){
            return s[0];
        }
        int start = 0;
        int end = s.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(key>=s[mid]){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return s[start%n];
    }

    public static void main(String[] args){
        System.out.println(findNext(new char[]{'a', 'c', 'f', 'h'}, 'f'));
        System.out.println(findNext(new char[]{'a', 'c', 'f', 'h'}, 'b'));
        System.out.println(findNext(new char[]{'a', 'c', 'f', 'h'}, 'm'));
        System.out.println(findNext(new char[]{'a', 'c', 'f', 'h'}, 'h'));
    }
}
