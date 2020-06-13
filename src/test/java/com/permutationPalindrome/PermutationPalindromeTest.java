package com.permutationPalindrome;

import com.permutationPalindrome.PermutationPalindrome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PermutationPalindromeTest {

    private PermutationPalindrome permutationPalindrome;

    @BeforeEach
    public void setup() {
        permutationPalindrome = new PermutationPalindrome();
    }

    @Test
    public void returnsTrueWhenWordIsAPermutationPalindrome() {
        final String word = "radar";
        assertTrue(permutationPalindrome.isPermutationPalindrome(word));
    }

    @Test
    public void returnsTrueWhenSentenceIsAPermutationPalindrome() {
        final String sentence = "was it a car or a cat i saw";
        assertTrue(permutationPalindrome.isPermutationPalindrome(sentence));
    }

    @Test
    public void returnsFalseWhenSentenceIsNotAPermutationPalindrome() {
        final String word = "car";
        assertFalse(permutationPalindrome.isPermutationPalindrome(word));
    }

}
