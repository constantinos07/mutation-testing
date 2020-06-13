package com.permutationPalindrome;

import java.util.HashSet;
import java.util.Set;

public class PermutationPalindrome {

    public boolean isPermutationPalindrome(String word) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (charSet.contains(word.charAt(i))) {
                charSet.remove(word.charAt(i));
            } else {
                charSet.add(word.charAt(i));
            }
        }
        return charSet.size() <= 1;
    }
}
