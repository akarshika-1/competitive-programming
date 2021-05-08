package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {

    public static boolean findStringPermutation(String s, String p){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        for(char pattern : p.toCharArray()){
            characterIntegerMap.put(pattern, characterIntegerMap.getOrDefault(pattern, 0)+1);
        }
        int matched = 0;
        int start = 0;

        for(int i=0; i<s.length(); i++){
            char right = s.charAt(i);
            if(characterIntegerMap.containsKey(right)){
                characterIntegerMap.put(right, characterIntegerMap.get(right)-1);
                if(characterIntegerMap.get(right)==0){
                    matched++;
                }
            }

            if(matched==characterIntegerMap.size())
                return true;

            if(i>=p.length()-1){
                char left = s.charAt(start++);
                if(characterIntegerMap.containsKey(left)){
                    if(characterIntegerMap.get(left)==0){
                        matched--;
                    }
                    characterIntegerMap.put(left, characterIntegerMap.getOrDefault(left, 0)+1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(findStringPermutation("oidbcaf", "abc"));
        System.out.println(findStringPermutation("odicf", "dc"));
        System.out.println(findStringPermutation("bcdxabcdy", "bcdyabcdx"));
        System.out.println(findStringPermutation("aaacb", "abc"));
    }
}
