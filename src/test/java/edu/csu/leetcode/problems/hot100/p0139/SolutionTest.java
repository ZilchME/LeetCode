package edu.csu.leetcode.problems.hot100.p0139;

import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void wordBreakTest() {
        Solution wb = new Solution();
        System.out.println(wb.wordBreak("abcd", Arrays.asList("a", "abc", "b", "cd")));
    }
}
