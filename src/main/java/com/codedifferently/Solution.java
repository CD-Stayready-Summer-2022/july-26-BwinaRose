package com.codedifferently;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        Map<Character, Integer> chars = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        char[] charsArr = input.toCharArray();
        for (char c : charsArr) {
            chars.merge(c, 1, Integer::sum);
        }
        for (Map.Entry entry : chars.entrySet()) {
            builder.append(entry.getKey() + ":" + entry.getValue()+ " ");
        }
        builder.deleteCharAt(builder.length()-1);
        return builder.toString();
    }
}
