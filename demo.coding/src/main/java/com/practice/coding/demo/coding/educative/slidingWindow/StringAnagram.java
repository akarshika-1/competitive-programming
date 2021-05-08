package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {

    public static List<Integer> findAnagrams(String str, String pattern){
        Map<Character, Integer> charIntegerMap = new HashMap<>();

        for(char p : pattern.toCharArray()){
            charIntegerMap.put(p, charIntegerMap.getOrDefault(p, 0)+1);
        }
        int matched = 0;
        int start = 0;
        List<Integer> indices = new ArrayList<>();

        for(int i=0;i<str.length(); i++){
            char right = str.charAt(i);
            if(charIntegerMap.containsKey(right)){
                charIntegerMap.put(right, charIntegerMap.get(right)-1);
                if(charIntegerMap.get(right)==0){
                    matched++;
                }
            }
            if(matched==charIntegerMap.size()){
                indices.add(start);
            }

            if(i>=pattern.length()-1){
                char left = str.charAt(start++);
                if(charIntegerMap.containsKey(left)){
                    if(charIntegerMap.get(left)==0){
                        matched--;
                    }
                }
                charIntegerMap.put(left, charIntegerMap.getOrDefault(left, 0)+1);
            }
        }
        return indices;
    }

    public static void main(String[] args){
        System.out.println(findAnagrams("ppqp", "pq"));
        System.out.println(findAnagrams("abbcabc", "abc"));

    }
}
