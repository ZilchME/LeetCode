package edu.csu.leetcode.hot100;

import org.junit.Test;

public class CombinationSumTest {

    @Test
    public void testCombinationSum() {
        CombinationSum solution = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(solution.combinationSum(candidates, target));
    }
}
