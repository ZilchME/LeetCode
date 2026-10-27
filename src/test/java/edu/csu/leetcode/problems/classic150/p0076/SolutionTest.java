package edu.csu.leetcode.problems.classic150.p0076;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testMinWindow() {
        Solution minWindow = new Solution();
        assertEquals("BANC", minWindow.minWindow("ADOBECODEBANC", "ABC"));
    }
}
