package com.practice.coding.demo.coding.geeksforgeeks.hashing;

import java.util.HashMap;
import java.util.Map;

public class FindItinerary {

    public static void main(String[] args){
        HashMap<String, String> dataSet = new HashMap<>();
        dataSet.put("Chennai", "Bangalore");
        dataSet.put("Bombay", "Delhi");
        dataSet.put("Goa", "Chennai");
        dataSet.put("Delhi", "Goa");
        findItinerary(dataSet);

    }

    public static void findItinerary(HashMap<String,String> dataSet){
        HashMap<String, String> reverseMap = new HashMap<>();
        for(Map.Entry<String, String> data : dataSet.entrySet()){
            reverseMap.put(data.getValue(), data.getKey());
        }

        String start = null;

        for(Map.Entry<String, String> data : dataSet.entrySet()){
            if(!reverseMap.containsKey(data.getKey())){
                start = data.getKey();
                break;
            }
        }

        if(start==null){
            System.out.println("Invalid input");
            return;
        }

        String to = dataSet.get(start);
        while(to!=null){
            System.out.println(start+" -> "+to);
            start = to;
            to = dataSet.get(start);
        }
    }
}
