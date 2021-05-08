package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    //longest substring with k distinct characters
    //two fruit basket with k = 2

    public static int findLength(String s, int k){
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++){
            Character rightChar = s.charAt(windowEnd);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar,0)+1);
            while(charFrequencyMap.size()>k){
                Character leftChar = s.charAt(start);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar)-1);
                if(charFrequencyMap.get(leftChar)==0){
                    charFrequencyMap.remove(leftChar);
                }
                start++;
            }
            maxLength = Math.max(maxLength, windowEnd - start + 1);
        }
        return maxLength;
    }

    public static void main(String args[]){
       System.out.println(findLength("araaci", 2));
        System.out.println(findLength("araaci", 1));
        System.out.println(findLength("cbbebi", 3));
    }
}
