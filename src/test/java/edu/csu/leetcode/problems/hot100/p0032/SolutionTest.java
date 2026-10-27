package edu.csu.leetcode.problems.hot100.p0032;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testLongestValidParenthesesTest(){
        String str = "(())(";
        Solution lp = new Solution();
        System.out.println(lp.longestValidParentheses(str));
    }
}
