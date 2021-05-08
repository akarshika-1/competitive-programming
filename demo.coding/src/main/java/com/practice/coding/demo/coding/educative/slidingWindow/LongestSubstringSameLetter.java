package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringSameLetter {

    public static int findSubstring(String s, int k){
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        int start = 0, maxLength = 0, maxRepeatLetterCount = 0;
        for(int i=0; i<s.length(); i++){
            Character rightChar = s.charAt(i);
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar,0)+1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, charFrequencyMap.get(rightChar));

            if(i-start+1-maxRepeatLetterCount > k){
                Character leftChar = s.charAt(start);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar)-1);
                start++;
            }
            maxLength=Math.max(maxLength, i-start+1);
        }
        return maxLength;

    }

    public static void main(String args[]){
        System.out.println(findSubstring("aabccbb", 2));
        System.out.println(findSubstring("abbcb", 1));

    }
}
