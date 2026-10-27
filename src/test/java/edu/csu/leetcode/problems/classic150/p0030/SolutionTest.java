package edu.csu.leetcode.problems.classic150.p0030;

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
