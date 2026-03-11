package edu.csu.leetcode.classic150.MinimumWindowSubstring76;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testFindSubstringTest() {
        Solution fb = new Solution();
        String s = "aaaaaaaaaaaaaa";
        String[] words = {"aa", "aa"};
        System.out.println(fb.findSubstring(s, words));
    }
}
