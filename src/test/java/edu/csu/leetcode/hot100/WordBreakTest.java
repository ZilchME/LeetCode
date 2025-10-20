package edu.csu.leetcode.hot100;

import org.junit.Test;

import java.util.Arrays;

public class WordBreakTest {
    @Test
    public void wordBreakTest() {
        WordBreak wb = new WordBreak();
        System.out.println(wb.wordBreak("abcd", Arrays.asList("a", "abc", "b", "cd")));
    }
}
