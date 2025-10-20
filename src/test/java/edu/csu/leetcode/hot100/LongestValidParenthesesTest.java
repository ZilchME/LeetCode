package edu.csu.leetcode.hot100;

import org.junit.Test;

public class LongestValidParenthesesTest {
    @Test
    public void testLongestValidParenthesesTest(){
        String str = "(())(";
        LongestValidParentheses lp = new LongestValidParentheses();
        System.out.println(lp.longestValidParentheses(str));
    }
}
