package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatSubstring {
    public static int findSubstring(String s){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for(int i=0; i<s.length(); i++){
            Character rightChar = s.charAt(i);
            if(characterIntegerMap.containsKey(rightChar)){
                start = Math.max(start, characterIntegerMap.get(rightChar)+1);
            }
            characterIntegerMap.put(rightChar, i);
            maxLength = Math.max(maxLength, i-start+1);
        }
        return maxLength;
    }

    public static void main(String args[]){
        System.out.println(findSubstring("aabccbb"));
        System.out.println(findSubstring("abbbb"));
        System.out.println(findSubstring("abccde"));
    }
}
