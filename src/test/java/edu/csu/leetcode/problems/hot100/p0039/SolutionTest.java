package edu.csu.leetcode.problems.hot100.p0039;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testCombinationSum() {
        Solution solution = new Solution();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(solution.combinationSum(candidates, target));
    }
}
