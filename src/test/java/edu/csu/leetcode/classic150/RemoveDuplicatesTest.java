package edu.csu.leetcode.classic150;

import org.junit.Test;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(rd.removeDuplicates(nums));
    }
}
