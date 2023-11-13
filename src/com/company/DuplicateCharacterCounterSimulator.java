package com.company;

import java.util.Map;
import java.util.Set;

public class DuplicateCharacterCounterSimulator {
    public static void main(String[] args) {
        DuplicateCharacterCounter dcc = new DuplicateCharacterCounter();
        String sentence = "If you're visiting this page, you're likely here because you're searching for a random " +
                "sentence. Sometimes a random word just isn't enough, and that is where the random sentence " +
                "generator comes into play. By inputting the desired number, you can make a list of as many " +
                "random sentences as you want or need. Producing random sentences can be helpful in a " +
                "number of different ways.";

        //Map<Character, Integer> result = dcc.countDuplicateCharacters(sentence);
        Map<Character, Long> result = dcc.countDuplicateCharacters(sentence);
        Set<Character>resultKeys = result.keySet();
        for(Character key: resultKeys){
            System.out.print("character: " + key + " count: " + result.get(key) + "\n");
        }
        System.out.print("");
    }
}
