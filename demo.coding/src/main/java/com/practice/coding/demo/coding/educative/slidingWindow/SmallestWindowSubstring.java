package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SmallestWindowSubstring {

    public static void main(String[] args){
        System.out.println(smallestSubstringWindow("aabdec", "abc"));
        System.out.println(smallestSubstringWindow("abdabca", "abc"));
        System.out.println(smallestSubstringWindow("adcad", "abc"));
    }

    public static String smallestSubstringWindow(String s, String p){
        Map<Character,Integer> map = new HashMap<>();
        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int start = 0;
        int substringStart = 0;
        int minLen = Integer.MAX_VALUE;
        int matched = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c)>=0){
                    matched++;
                }
            }

            while(matched==p.length()){
                if(i-start+1<minLen){
                    minLen = i-start+1;
                    substringStart = start;
                }
                char leftChar = s.charAt(start++);
                if(map.containsKey(leftChar)){
                    if(map.get(leftChar)==0){
                        matched--;
                    }
                    map.put(leftChar, map.get(leftChar)+1);
                }
            }

        }
        return minLen==Integer.MAX_VALUE?"":s.substring(substringStart,substringStart+minLen);
    }
}
