package edu.csu.leetcode.problems.hot100.p0394;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testDecodeString(){
        Solution ds = new Solution();
        assertEquals("aaabcbc", ds.decodeString("3[a]2[bc]"));
    }

    @Test
    public void decodesNestedRepetition() {
        assertEquals("accaccacc", new Solution().decodeString("3[a2[c]]"));
    }
}
