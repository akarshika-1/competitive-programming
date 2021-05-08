package com.practice.coding.demo.coding.educative.slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordConcatenation {
    public static void main(String[] args){
        System.out.println(findIndexes(new String[]{"cat", "fox"}, "catfoxcat"));
        System.out.println(findIndexes(new String[]{"cat", "fox"}, "catcatfoxfox"));

    }

    public static List<Integer> findIndexes(String[] words, String s){
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        int wordCount = words.length;
        int wordLength = words[0].length();

        List<Integer> result = new ArrayList<>();

        for(int i=0; i<=s.length()-wordCount*wordLength; i++){
            Map<String, Integer> wordSeen = new HashMap<>();
            for(int j=0;j<wordCount; j++){
                int nextIndex = i + j*wordLength;
                String word = s.substring(nextIndex, nextIndex+wordLength);
                if(!map.containsKey(word)){
                    break;
                }
                wordSeen.put(word, wordSeen.getOrDefault(word, 0)+1);

                if(wordSeen.get(word)>map.get(word)){
                    break;
                }

                if(j+1==wordCount){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
