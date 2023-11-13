package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacterCounter {

    /*public Map<Character, Integer> countDuplicateCharacters(String aString){
        Map<Character,Integer>charMap = new HashMap<>();
        for(int i = 0; i < aString.length(); i++){
            if(charMap.get(aString.charAt(i))== null){
                charMap.put(aString.charAt(i), 1);
            }else{
                charMap.put(aString.charAt(i), charMap.get(aString.charAt(i))+1);
            }
        }
        //return removeNonDuplicates(charMap);
        return charMap;
    }*/


    //books solution 1
    /*public Map<Character, Integer> countDuplicateCharacters(String aString){
        Map<Character,Integer>charMap = new HashMap<>();
        for(int i = 0; i < aString.length(); i++){
            char ch = (aString.charAt(i));
            charMap.compute(ch, (k,v) -> (v==null) ? 1: ++v);
        }
        return charMap;
    */


    //books solution 2
    public Map<Character, Long> countDuplicateCharacters(String aString){
        Map<Character,Long>result = aString.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        return result;
    }

    private Map<Character, Integer> removeNonDuplicates(Map<Character, Integer>mixCharCount){
        Map<Character,Integer>duplicates = new HashMap<>();
        Set<Character> mixCharKeys = mixCharCount.keySet();
        for(char key: mixCharKeys){
            if(mixCharCount.get(key) > 0){
                duplicates.put(key,mixCharCount.get(key));
            }
        }
        return duplicates;
    }
}
