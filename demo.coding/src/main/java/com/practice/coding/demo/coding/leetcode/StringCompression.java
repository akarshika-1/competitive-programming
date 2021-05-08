package com.practice.coding.demo.coding.leetcode;

public class StringCompression {

    public static void main(String[] args){
        char[] chars1 = new char[]{'a','a','b','b','c','c','c'};
        char[] chars2 = new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars1));
        System.out.println(compress(chars2));
    }

    public static String compress(char[] chars) {

        String s = ""+chars[0];
        int count = 1;
        for(int i=1; i<chars.length; i++){
            char prev = chars[i-1];
            char curr = chars[i];

            if(prev==curr){
                count++;
            }else{
                if(count>1){
                    s += count;
                    count = 1;
                }
                s += curr;
            }
        }

        if(count>1){
            s += count;
        }

        return s;

    }
}
