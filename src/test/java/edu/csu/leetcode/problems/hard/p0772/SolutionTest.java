package edu.csu.leetcode.problems.hard.p0772;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void addsNumbers() {
        assertEquals(2, new Solution().calculate("1+1"));
    }

    @Test
    public void respectsOperatorPrecedence() {
        assertEquals(4, new Solution().calculate("6-4/2"));
    }

    @Test
    public void evaluatesNestedExpression() {
        assertEquals(21, new Solution().calculate("2*(5+5*2)/3+(6/2+8)"));
    }

    @Test
    public void acceptsSingleNumber() {
        assertEquals(12345, new Solution().calculate("12345"));
    }

    @Test
    public void truncatesNegativeDivisionTowardZero() {
        assertEquals(-3, new Solution().calculate("(0-7)/2"));
    }

    @Test
    public void evaluatesEqualPrecedenceFromLeftToRight() {
        assertEquals(2, new Solution().calculate("8/2/2"));
        assertEquals(3, new Solution().calculate("8-3-2"));
    }
}
