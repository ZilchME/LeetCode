package edu.csu.leetcode.problems.classic150.p0080;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testRemoveDuplicates() {
        Solution rd = new Solution();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(rd.removeDuplicates(nums));
    }
}
