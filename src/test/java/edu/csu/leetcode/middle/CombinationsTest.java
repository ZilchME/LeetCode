package edu.csu.leetcode.middle;

import org.junit.Test;

public class CombinationsTest {
    @Test
    public void testCombinations() {
        Combinations solution = new Combinations();
        int n = 4;
        int k = 2;
        System.out.println(solution.combine(n, k));
    }
}