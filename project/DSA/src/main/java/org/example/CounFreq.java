package org.example;

import java.util.HashMap;
import java.util.Map;

public class CounFreq {
    public static void main(String[] args) {
        String a = "purvadhere";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : a.toCharArray()){
                map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +"=>"+ entry.getValue());
        }
    }
}
