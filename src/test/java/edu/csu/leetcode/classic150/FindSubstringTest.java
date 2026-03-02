package edu.csu.leetcode.classic150;

import org.junit.Test;

public class FindSubstringTest {
    @Test
    public void testFindSubstringTest() {
        FindSubstring fb = new FindSubstring();
        String s = "aaaaaaaaaaaaaa";
        String[] words = {"aa", "aa"};
        System.out.println(fb.findSubstring(s, words));
    }
}
